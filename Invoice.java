/**
 * Kelas ini digunakan untuk getter data invoice pada JFood.
 * 
 * @author Ananda Rizky Duto Pamungkas
 * @version 27 Februari 2020
 * 
 */

public abstract class Invoice
{
    private int id;
    private Food food;
    private String date;
    protected int totalPrice;
    private Customer customer;
    private InvoiceStatus invoiceStatus;

    /*
     * Metode untuk melakukan referensi dari suatu objek private pada kelas
     */
    
    public Invoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus)
    {
        this.id = id;
        this.food = food;
        this.date = date;
        this.customer = customer;
        this.invoiceStatus = invoiceStatus;
    }

    /*
     * Metode untuk mendapatkan id invoice
     * 
     * @return id dari invoice
     */
    
    public int getId()
    {
        return id;
    }

    /*
     * Metode untuk mendapatkan id makanan
     * 
     * @return idFood dari invoice
     */
    
    public Food getFood()
    {
        return food;
    }
    
    /*
     * Metode untuk mendapatkan tanggal invoice
     * 
     * @return date dari invoice
     */
    
    public String getDate()
    {
        return date;
    }
    
    /*
     * Metode untuk mendapatkan harga keseluruhan pada invoice
     * 
     * @return totalPrice dari invoice
     */
    
    public int getTotalPrice()
    {
        return totalPrice;
    }
    
    /*
     * Metode untuk mendapatkan nama pelanggan pada invoice
     * 
     * @return customer dari pelanggan
     */
    
    public Customer getCustomer()
    {
        return customer;
    }
    
    public abstract PaymentType getPaymentType();
    
    public InvoiceStatus getInvoiceStatus()
    {
        return invoiceStatus;
    }
    
    /*
     * Metode untuk merubah id invoice
     * 
     * @return id dari invoice
     */
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    /*
     * Metode untuk merubah id makanan pada invoice
     * 
     * @return idFood dari invoice
     */
    
    public void setFoods(Food food)
    {
        this.food = food;
    }
    
    /*
     * Metode untuk merubah tanggal invoice
     * 
     * @return date dari invoice
     */
    
    public void setDate(String date)
    {
        this.date = date;
    }
    
    /*
     * Metode untuk merubah harga keseluruhan pada invoice
     * 
     * @return totalPrice dari invoice
     */
    
    public abstract void setTotalPrice();
    
    /*
     * Metode untuk merubah pelanggan pada invoice
     * 
     * @return customer dari invoice
     */
    
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    
    public void setInvoiceStatus(InvoiceStatus status)
    {
        this.invoiceStatus = invoiceStatus;
    }
    
    /*
     * Metode untuk menampilkan data
     * 
     * @return idFood dari invoice
     */
    
    public abstract void printData();
    
        /*System.out.println("===============INVOICE===============");
        System.out.println("ID: " + this.id);
        System.out.println("Food ID: " + this.idFood);
        System.out.println("Date: " + this.date);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Total Price: " + this.totalPrice);
        System.out.println("Status: " + this.status);*/
    
}