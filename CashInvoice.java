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
    
    public CashInvoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus)
    {
        super(id, food, date, customer, invoiceStatus);
    }
    
    public CashInvoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus, int deliveryFee)
    {
        super(id, food, date, customer, invoiceStatus);
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
    
    public void printData()
    {
        if(this.deliveryFee > 0)
        {
            System.out.println("==========INVOICE==========");
            System.out.println("ID : " + getId());
            System.out.println("Food : " + getFood().getName());
            System.out.println("Date : " + getDate());
            System.out.println("Customer : " + getCustomer().getName());
            System.out.println("Delivery Fee : " + getDeliveryFee());
            System.out.println("Total price : " + getTotalPrice());
            System.out.println("Status : " + getInvoiceStatus());
            System.out.println("Payment Type : " + getPaymentType());
            System.out.println(" ");
        }
        
        else
        {
            System.out.println("==========INVOICE==========");
            System.out.println("ID : " + getId());
            System.out.println("Food : " + getFood().getName());
            System.out.println("Date : " + getDate());
            System.out.println("Customer : " + getCustomer().getName());
            System.out.println("Delivery Fee : Free Delivery");
            System.out.println("Total price : " + getTotalPrice());
            System.out.println("Status : " + getInvoiceStatus());
            System.out.println("Payment Type : " + getPaymentType());
            System.out.println(" ");
        }
    }
}
