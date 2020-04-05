/**
 * Kelas untuk membentuk invoice dengan pembayaran Cash
 *
 * @author Ananda Rizky Duto Pamungkas
 * @version 10 Maret 2020
 */

import java.util.*;
import java.text.SimpleDateFormat;

public class CashInvoice extends Invoice
{
    private static final PaymentType PAYMENT_TYPE = PaymentType.Cash;
    private int deliveryFee;
    
    public CashInvoice(int id, ArrayList<Food> foods, Customer customer)
    {
        super(id, foods, customer);
    }
    
    public CashInvoice(int id, ArrayList<Food> foods, Customer customer, int deliveryFee)
    {
        super(id, foods, customer);
        this.deliveryFee = deliveryFee;
    }
    
    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }
    
    public int getDeliveryFee()
    {
        return deliveryFee;
    }
    
    public void setDeliveryFee(int deliveryFee)
    {
        this.deliveryFee = deliveryFee;
    }
    
    public void setTotalPrice()
    {
        int n;
        this.totalPrice = 0;
        if(this.deliveryFee > 0)
        {
            for(n = 0; n < getFoods().size(); n++)
            {
                this.totalPrice += getFoods().get(n).getPrice();
            }

            this.totalPrice += this.deliveryFee;
        }
        
        else
        {
            for(n = 0; n < getFoods().size(); n++)
            {
                this.totalPrice += getFoods().get(n).getPrice();
            }
    
        }
    }
    
    public String toString()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        String foods = "";
        for (Food foodList : getFoods())
        {
            foods = foods + foodList.getName() + ", ";
        }
        foods = foods.substring(0, foods.length()-2);

        if(this.deliveryFee > 0)
        {
            return "==========INVOICE==========\n\n" +
                   "ID : " + getId() +
                   "\nFood : " + foods +
                   "\nDate : " + sdf.format(super.getDate().getTime()) +
                   "\nCustomer : " + getCustomer().getName() +
                   "\nDelivery Fee : " + getDeliveryFee() +
                   "\nTotal price : " + getTotalPrice() +
                   "\nStatus : " + getInvoiceStatus() +
                   "\nPayment Type : " + getPaymentType() +
                   "\n";
        }
        
        else
        {
            return "==========INVOICE==========\n\n" +
                   "ID : " + getId() +
                   "\nFood : " + foods +
                   "\nDate : " + sdf.format(super.getDate().getTime()) +
                   "\nCustomer : " + getCustomer().getName() +
                   "\nDelivery Fee : Free Delivery" +
                   "\nTotal price : " + getTotalPrice() +
                   "\nStatus : " + getInvoiceStatus() +
                   "\nPayment Type : " + getPaymentType() +
                   "\n";
        }
    }
}
