/**
 * Kelas ini digunakan untuk getter data invoice pada JFood.
 * 
 * @author Ananda Rizky Duto Pamungkas
 * @version 27 Februari 2020
 * 
 */

public class Invoice
{
    private int id;
    private int idFood;
    private String date;
    private int totalPrice;
    private Customer customer;

    /*
     * Metode untuk melakukan referensi dari suatu objek private pada kelas
     */
    
    public Invoice(int id, int idFood, String date, Customer customer, int totalPrice)
    {
        this.id = id;
        this.idFood = idFood;
        this.date = date;
        this.customer = customer;
        this.totalPrice = totalPrice;
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
    
    public int gerIdFood()
    {
        return idFood;
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
    
    public void setIdFoods(int idFood)
    {
        this.idFood = idFood;
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
    
    public void setTotalPrice(int totalPrice)
    {
        this.totalPrice = totalPrice;
    }
    
    /*
     * Metode untuk merubah pelanggan pada invoice
     * 
     * @return customer dari invoice
     */
    
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    
    /*
     * Metode untuk menampilkan data
     * 
     * @return idFood dari invoice
     */
    
    public void printData()
    {
        System.out.println(this.idFood);
    }
}