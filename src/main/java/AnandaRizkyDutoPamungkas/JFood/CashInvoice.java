package AnandaRizkyDutoPamungkas.JFood;

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

    /**
     * Constructor pertama untuk objek invoice cash
     * @param id
     * @param foods
     * @param customer
     */
    public CashInvoice(int id, ArrayList<Food> foods, Customer customer)
    {
        super(id, foods, customer);
    }

    /**
     * Constructor kedua untuk objek invoice cash dengan delivery fee
     * @param id
     * @param foods
     * @param customer
     * @param deliveryFee
     */
    public CashInvoice(int id, ArrayList<Food> foods, Customer customer, int deliveryFee)
    {
        super(id, foods, customer);
        this.deliveryFee = deliveryFee;
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
     * Getter delivery fee
     * @return deliveryFee
     */
    public int getDeliveryFee()
    {
        return deliveryFee;
    }

    /**
     * Setter delivery fee
     * @param deliveryFee
     */
    public void setDeliveryFee(int deliveryFee)
    {
        this.deliveryFee = deliveryFee;
    }

    /**
     * Metode yang meng-overload parent untuk menghitung total harga
     */
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

    /**
     * Metode untuk menampilkan data
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
