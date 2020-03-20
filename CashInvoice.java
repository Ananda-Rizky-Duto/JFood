/**
 * Kelas untuk membentuk invoice dengan pembayaran Cash
 *
 * @author Ananda Rizky Duto Pamungkas
 * @version 10 Maret 2020
 */

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
        if(this.deliveryFee > 0)
        {
            return "==========INVOICE==========\n\n" +
                   "ID : " + getId() +
                   "Food : " + getFood().getName() +
                   "Date : " + getDate() +
                   "Customer : " + getCustomer().getName() +
                   "Delivery Fee : " + getDeliveryFee() +
                   "Total price : " + getTotalPrice() +
                   "Status : " + getInvoiceStatus() +
                   "Payment Type : " + getPaymentType() +
                   " ";
        }
        
        else
        {
            return "==========INVOICE==========\n\n" +
                   "ID : " + getId() +
                   "Food : " + getFood().getName() +
                   "Date : " + getDate() +
                   "Customer : " + getCustomer().getName() +
                   "Delivery Fee : Free Delivery" +
                   "Total price : " + getTotalPrice() +
                   "Status : " + getInvoiceStatus() +
                   "Payment Type : " + getPaymentType() +
                   " ";
        }
    }
}
