package AnandaRizkyDutoPamungkas.JFood.controller;

import AnandaRizkyDutoPamungkas.JFood.*;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.util.ArrayList;

@RequestMapping("/invoice")
@RestController

public class InvoiceController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Invoice> getAllInvoice() {
        return DatabaseInvoice.getInvoiceDatabase();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Invoice getInvoiceById(@PathVariable int id) {
        Invoice invoice = null;
        try {
            invoice = DatabaseInvoice.getInvoiceById(id);
        } catch (InvoiceNotFoundException e) {
            e.getMessage();
            return null;
        }
        return invoice;
    }

    @RequestMapping(value = "/customer/{customerId}", method = RequestMethod.GET)
    public ArrayList<Invoice> getInvoiceByCustomer(@PathVariable int customerId) {
        ArrayList<Invoice> invoice = null;
        invoice = DatabaseInvoice.getInvoiceByCustomer(customerId);
        return invoice;
    }

    @RequestMapping(value = "/invoiceStatus/{id}", method = RequestMethod.PUT)
    public Invoice changeInvoiceStatus(@PathVariable
                                       @RequestParam(value = "id") int id,
                                       @RequestParam(value = "status") InvoiceStatus status)
    {
        Invoice invoice = null;
        if(DatabaseInvoice.changeInvoiceStatus(id, status))
        {
            try
            {
                invoice = DatabaseInvoice.getInvoiceById(id);
            }
            catch(InvoiceNotFoundException e)
            {
                e.getMessage();
            }
            return invoice;
        }
        else
        {
            return null;
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public boolean removeInvoice(@PathVariable
                                 @RequestParam(value = "id") int id)
    {
        try
        {
            DatabaseInvoice.removeInvoice(id);
            return true;
        }
        catch(InvoiceNotFoundException e)
        {
            e.getMessage();
            return false;
        }

    }

    @RequestMapping(value = "/createCashInvoice", method = RequestMethod.POST)
    public Invoice addCashInvoice(@RequestParam(value="foodList") ArrayList<Integer> foodIdList,
                                  @RequestParam(value="customerId") int customerId,
                                  @RequestParam(value="deliveryFee", required = false, defaultValue = "0") int deliveryFee)
    {
        ArrayList<Food> menu = new ArrayList<>();
        for (Integer foodId : foodIdList)
        {
            try
            {
                menu.add(DatabaseFood.getFoodById(foodId));
            } catch (FoodNotFoundException e) {
                e.printStackTrace();
            }
        }

        try{
            Invoice invoice = new CashInvoice(DatabaseInvoice.getLastId() + 1, menu, DatabaseCustomer.getCustomerById(customerId), deliveryFee);
            DatabaseInvoice.addInvoice(invoice);
            DatabaseInvoice.getInvoiceByCustomer(customerId).get(DatabaseInvoice.getInvoiceByCustomer(customerId).size()-1).setTotalPrice();
            return invoice;
        }
        catch (OngoingInvoiceAlreadyExistsException e){
            e.getMessage();
        }
        catch (CustomerNotFoundException e)
        {
            e.getMessage();
        }
        return null;
    }

    @RequestMapping(value = "/createCashlessInvoice", method = RequestMethod.POST)
    public Invoice addCashlessInvoice(@RequestParam(value="foodList") ArrayList<Integer> foodIdList,
                                      @RequestParam(value="customerId") int customerId,
                                      @RequestParam(value="promoCode", required = false) String promoCode)
    {
        ArrayList<Food> menu = new ArrayList<>();
        for (Integer foodId : foodIdList)
        {
            try
            {
                menu.add(DatabaseFood.getFoodById(foodId));
            } catch (FoodNotFoundException e) {
                e.printStackTrace();
            }
        }

        Promo promo = DatabasePromo.getPromoByCode(promoCode);
        try{
            Invoice invoice = new CashlessInvoice(DatabaseInvoice.getLastId() + 1, menu, DatabaseCustomer.getCustomerById(customerId), promo);
            DatabaseInvoice.addInvoice(invoice);
            DatabaseInvoice.getInvoiceByCustomer(customerId).get(DatabaseInvoice.getInvoiceByCustomer(customerId).size()-1).setTotalPrice();
            return invoice;
        }
        catch (OngoingInvoiceAlreadyExistsException e){
            e.getMessage();
        }
        catch (CustomerNotFoundException e)
        {
            e.getMessage();
        }
        return null;
    }
}