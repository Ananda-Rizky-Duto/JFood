package AnandaRizkyDutoPamungkas.JFood;

/**
* Child class dari invoice class
*
* @author Ananda Rizky Duto Pamungkas
* @version 10 Maret 2020
*/
    
import java.util.*;
import java.text.*;
import java.text.SimpleDateFormat;  
import java.util.Date; 
    
public class CashlessInvoice extends Invoice
{
    private static final PaymentType PAYMENT_TYPE = PaymentType.Cashless;
    private Promo promo;

    /**
     * Constructor pertama untuk objek invoice cashless
     * @param id
     * @param foods
     * @param customer
     */
    public CashlessInvoice(int id, ArrayList<Food> foods, Customer customer)
    {
        super(id, foods, customer);
    }

    /**
     * Constructor kedua untuk objek invoice cashless dengan promo
     * @param id
     * @param foods
     * @param customer
     * @param promo
     */
    public CashlessInvoice(int id, ArrayList<Food> foods, Customer customer, Promo promo)
    {
        super(id, foods, customer);
        this.promo = promo;
    }

    /**
     * Getter tipe pembayaran
     * @return PAYMENT_TYPE
     */
    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }

    /**
     * Getter promo
     * @return promo
     */
    public Promo getPromo()
    {
        return promo;
    }

    /**
     * Setter promo
     * @param promo
     */
    public void setPromo(Promo promo)
    {
        this.promo = promo;
    }

    /**
     * Metode yang meng-overload parent untuk menghitung total harga
     */
    public void setTotalPrice()
    {
        int n;
        this.totalPrice = 0;
        for(n = 0; n < getFoods().size(); n++)
        {
            if (promo != null && promo.getActive() && getFoods().get(n).getPrice() > promo.getMinPrice())
            {
                this.totalPrice += getFoods().get(n).getPrice() - promo.getDiscount();
            }
            
            else
            {
                this.totalPrice += getFoods().get(n).getPrice();
            }
        }
    }

    /**
     * Method untuk menampilkan data
     * @return string
     */
    public String toString()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        String foods = "";
        for (Food foodList : getFoods())
        {
            foods = foods + foodList.getName() + ", ";
        }
        foods = foods.substring(0, foods.length()-2);

        if(promo != null)
        { 
            if(promo.getActive())
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
