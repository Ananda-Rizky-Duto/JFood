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
    
    public CashlessInvoice(int id, ArrayList<Food> foods, Customer customer)
    {
        super(id, foods, customer);
    }
        
    public CashlessInvoice(int id, ArrayList<Food> foods, Customer customer, Promo promo)
    {
        super(id, foods, customer);
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
        int n;
        for(n = 0; n < getFoods().size(); n++)
        {
            if (promo != null && promo.getActive() == true && getFoods().get(n).getPrice() > promo.getMinPrice())
            {
                this.totalPrice = getFoods().get(n).getPrice() - promo.getDiscount();
            }
            
            else
            {
                this.totalPrice = getFoods().get(n).getPrice();
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
        int n = 0;

        if(promo != null)
        { 
            if(promo.getActive() == true && getFoods().get(n).getPrice() >= promo.getMinPrice())
            {
                return "==========INVOICE==========\n\n" +
                       "ID : " + getId() +
                       "\nFood : " + foods +
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
                       "\nFood : " + foods +
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
                   "\nFood : " + foods +
                   "\nDate : " + sdf.format(super.getDate().getTime()) +
                   "\nCustomer : " + getCustomer().getName() +
                   "\nTotal price : " + getTotalPrice() +
                   "\nStatus : " + getInvoiceStatus() +
                   "\nPayment Type : " + getPaymentType() +
                   "\n";
        }
    }
}
