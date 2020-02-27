public class Invoice
{
    /**
     * Kelas ini digunakan untuk getter data invoice pada JFood.
     * 
     * @author Ananda Rizky Duto Pamungkas
     * @version 27 Februari 2020
     * 
     */
    
    private int id;
    private int idFood;
    private String date;
    private int totalPrice;
    private Customer customer;

    public Invoice(int id, int idFood, String date, Customer customer, int totalPrice)
    {
        this.id = id;
        this.idFood = idFood;
        this.date = date;
        this.customer = customer;
        this.totalPrice = totalPrice;
    }

    public int getId()
    {
        return id;
    }

    public int gerIdFood()
    {
        return idFood;
    }
    
    public String getDate()
    {
        return date;
    }
    
    public int getTotalPrice()
    {
        return totalPrice;
    }
    
    public Customer getCustomer()
    {
        return customer;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setIdFoods(int idFood)
    {
        this.idFood = idFood;
    }
    
    public void setDate(String date)
    {
        this.date = date;
    }
    
    public void setTotalPrice(int totalPrice)
    {
        this.totalPrice = totalPrice;
    }
    
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    
    public void printData()
    {
        
    }
}