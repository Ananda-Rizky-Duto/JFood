/**
* Write a description of class CashlessInvoice here.
*
* @author (your name)
* @version (a version number or a date)
*/
    
import java.util.*;
import java.text.*;
import java.text.SimpleDateFormat;  
import java.util.Date; 
    
public class CashlessInvoice extends Invoice
{
    private static final PaymentType PAYMENT_TYPE = PaymentType.Cashless;
    private Promo promo;
    
    public CashlessInvoice(int id, Food food, Customer customer, InvoiceStatus invoiceStatus)
    {
        super(id, food, customer, invoiceStatus);
    }
        
    public CashlessInvoice(int id, Food food, Customer customer, InvoiceStatus invoiceStatus, Promo promo)
    {
        super(id, food, customer, invoiceStatus);
        this.promo = promo;
    }
        
    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }
        
    public Promo getPromo()
    {
        return promo;
    }
        
    public void setPromo(Promo promo)
    {
        this.promo = promo;
    }
        
    public void setTotalPrice()
    {
        if(promo!= null && promo.getActive() == true && getFood().getPrice() > promo.getMinPrice())
        {
            this.totalPrice = getFood().getPrice() - promo.getDiscount();
        }
            
        else
        {
            this.totalPrice = getFood().getPrice();
        }
    }
        
    public String toString()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        if(promo != null)
        { 
            if(promo.getActive() == true && getFood().getPrice() >= promo.getMinPrice())
            {
                return "==========INVOICE==========\n\n" +
                       "ID : " + getId() +
                       "\nFood : " + getFood().getName() +
                       "\nDate : " + sdf.format(super.getDate().getTime()) +
                       "\nCustomer : " + getCustomer().getName() +
                       "\nTotal price : " + getTotalPrice() +
                       "\nStatus : " + getInvoiceStatus() +
                       "\nPayment Type : " + getPaymentType() +
                       "\n" +
                       "\n==PROMO==\n" +
                       "\nCode : " + promo.getCode() +
                       "\nDiscount : " + promo.getDiscount() +
                       "\nMinimum Price : " + promo.getMinPrice() +
                       "\n";
            }
            
            else
            {
                return "==========INVOICE==========\n\n" +
                       "ID : " + getId() +
                       "\nFood : " + getFood().getName() +
                       "\nDate : " + sdf.format(super.getDate().getTime()) +
                       "\nCustomer : " + getCustomer().getName() +
                       "\nTotal price : " + getTotalPrice() +
                       "\nStatus : " + getInvoiceStatus() +
                       "\nPayment Type : " + getPaymentType() +
                       "\n" +
                       "PROMO" +
                       "\nPromo tidak berlaku" +
                       "\n";
            }
        }
        
        else
        {
            return "==========INVOICE==========\n\n" +
                   "ID : " + getId() +
                   "\nFood : " + getFood().getName() +
                   "\nDate : " + sdf.format(super.getDate().getTime()) +
                   "\nCustomer : " + getCustomer().getName() +
                   "\nTotal price : " + getTotalPrice() +
                   "\nStatus : " + getInvoiceStatus() +
                   "\nPayment Type : " + getPaymentType() +
                   "\n";
        }
    }
}
