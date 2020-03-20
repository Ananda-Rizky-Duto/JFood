/**
 * Kelas untuk membentuk invoice dengan pembayaran Cash
 *
 * @author Ananda Rizky Duto Pamungkas
 * @version 10 Maret 2020
 */

import java.util.*;
import java.text.*;
import java.text.SimpleDateFormat;  
import java.util.Date; 

public class CashInvoice extends Invoice
{
    private static final PaymentType PAYMENT_TYPE = PaymentType.Cash;
    private int deliveryFee;
    
    public CashInvoice(int id, Food food, Customer customer, InvoiceStatus invoiceStatus)
    {
        super(id, food, customer, invoiceStatus);
    }
    
    public CashInvoice(int id, Food food, Customer customer, InvoiceStatus invoiceStatus, int deliveryFee)
    {
        super(id, food, customer, invoiceStatus);
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
        if(this.deliveryFee > 0)
        {
            this.totalPrice = getFood().getPrice() + this.deliveryFee;
        }
        
        else
        {
            this.totalPrice = getFood().getPrice();
    
        }
    }
    
    public String toString()
    {
        SimpleDateFormat format = new SimpleDateFormat("dd MMMM yyyy");
        Date date = new Date();
        if(this.deliveryFee > 0)
        {
            return "==========INVOICE==========\n\n" +
                   "ID : " + getId() +
                   "\nFood : " + getFood().getName() +
                   "\nDate : " + format.format(getDate().getTime()) +
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
                   "\nFood : " + getFood().getName() +
                   "\nDate : " + format.format(getDate().getTime()) +
                   "\nCustomer : " + getCustomer().getName() +
                   "\nDelivery Fee : Free Delivery" +
                   "\nTotal price : " + getTotalPrice() +
                   "\nStatus : " + getInvoiceStatus() +
                   "\nPayment Type : " + getPaymentType() +
                   "\n";
        }
    }
}
