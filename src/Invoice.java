/**
 * Kelas ini digunakan untuk getter data invoice pada JFood.
 * 
 * @author Ananda Rizky Duto Pamungkas
 * @version 27 Februari 2020
 * 
 */

import java.util.*;
import java.text.*;

public abstract class Invoice
{
    private int id;
    private ArrayList<Food> foods;
    private Calendar date;
    protected int totalPrice;
    private Customer customer;
    private InvoiceStatus invoiceStatus;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Ongoing;

    /*
     * Metode untuk melakukan referensi dari suatu objek private pada kelas
     */
    
    public Invoice(int id, ArrayList<Food> foods, Customer customer)
    {
        this.id = id;
        this.foods = foods;
        this.customer = customer;
        date = setDate(Calendar.getInstance());
        this.invoiceStatus = InvoiceStatus.Ongoing;
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
    
    public ArrayList<Food> getFoods()
    {
        return foods;
    }
    
    /*
     * Metode untuk mendapatkan tanggal invoice
     * 
     * @return date dari invoice
     */
    
    public Calendar getDate()
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
    
    public void setFoods(ArrayList<Food> foods)
    {
        this.foods = foods;
    }
    
    /*
     * Metode untuk merubah tanggal invoice
     * 
     * @return date dari invoice
     */
    
    public Calendar setDate(Calendar date)
    {
        return date;
    }
    
    public Calendar setDate(int year, int month, int dayOfMonth)
    {
        date = new GregorianCalendar(year, month, dayOfMonth);
        return date;
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
    
    public abstract String toString();
    
        /*System.out.println("===============INVOICE===============");
        System.out.println("ID: " + this.id);
        System.out.println("Food ID: " + this.idFood);
        System.out.println("Date: " + this.date);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Total Price: " + this.totalPrice);
        System.out.println("Status: " + this.status);*/
    
}