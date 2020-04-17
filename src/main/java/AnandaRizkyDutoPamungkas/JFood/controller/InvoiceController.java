package AnandaRizkyDutoPamungkas.JFood.controller;

import AnandaRizkyDutoPamungkas.JFood.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/invoice")
@RestController

public class InvoiceController {
    @RequestMapping("")
    public ArrayList<Invoice> getAllInvoice() {
        return DatabaseInvoice.getInvoiceDatabase();
    }

    @RequestMapping("/{id}")
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

    @RequestMapping("/customer/{customerId}")
    public ArrayList<Invoice> getInvoiceByCustomer(@PathVariable int customerId) {
        ArrayList<Invoice> invoice = null;
        invoice = DatabaseInvoice.getInvoiceByCustomer(customerId);
        return invoice;
    }

    @RequestMapping(value = "/invoiceStatus/{id}", method = RequestMethod.POST)
    public Invoice changeInvoiceStatus(@RequestParam(value = "id") int id,
                                       @RequestParam(value = "status") InvoiceStatus status)
    {
        Invoice invoice = null;
        if(DatabaseInvoice.changeInvoiceStatus(id, status))
        {
            return invoice;
        }
        else
        {
            return null;
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public boolean removeInvoice(@RequestParam(value = "id") int id)
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
    public Invoice addCashInvoice(@RequestParam(value="foodList") ArrayList<int> foodList,
                                  @RequestParam(value="customerId") int customerId,
                                  @RequestParam(value="deliveryFee") int deliveryFee)
    {
        try{
            Invoice invoice = new CashInvoice(DatabaseInvoice.getLastId() + 1, foodList, DatabaseCustomer.getCustomerById(customerId), deliveryFee);
            DatabaseInvoice.getInvoiceByCustomer(customerId).get(DatabaseInvoice.getInvoiceByCustomer(customerId).size()-1).setTotalPrice();
            DatabaseInvoice.addInvoice(invoice);
            return invoice;
        }
        catch (OngoingInvoiceAlreadyExistsException e){
            e.getMessage();
        }
        catch (CustomerNotFoundException e)
        {
            e.getMessage();
        }
        catch (FoodNotFoundException e)
        {
            e.getMessage();
        }
        return null;
    }

    @RequestMapping(value = "/createCashlessInvoice", method = RequestMethod.POST)
    public Invoice addCashlessInvoice(@RequestParam(value="foodList") ArrayList<int> foodList,
                                      @RequestParam(value="customerId") int customerId,
                                      @RequestParam(value="promoCode") Promo promoCode)
    {
        try{
            Invoice invoice = new CashlessInvoice(DatabaseInvoice.getLastId() + 1, DatabaseFood.getFoodDatabase()foodList, DatabaseCustomer.getCustomerById(customerId), promoCode);
            DatabaseInvoice.getInvoiceByCustomer(customerId).get(DatabaseInvoice.getInvoiceByCustomer(customerId).size()-1).setTotalPrice();
            DatabaseInvoice.addInvoice(invoice);
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