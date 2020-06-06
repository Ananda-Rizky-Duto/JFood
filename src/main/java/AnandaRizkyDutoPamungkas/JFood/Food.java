package AnandaRizkyDutoPamungkas.JFood;

/**
 * Kelas ini digunakan untuk getter data makanan pada JFood.
 * 
 * @author Ananda Rizky Duto Pamungkas
 * @version 5 Maret 2020
 * 
 */

public class Food
{
    private int id;
    private String name;
    private Seller seller;
    private int price;
    private FoodCategory category;

    /**
     * Constructor untuk objek food
     * @param id
     * @param name
     * @param seller
     * @param price
     * @param category
     */
    
    public Food(int id, String name, Seller seller, int price, FoodCategory category)
    {
        this.id = id;
        this.name = name;
        this.seller = seller;
        this.price = price;
        this.category = category;
    }

    /**
     * Metode untuk mendapatkan id makanan
     * @return id dari makanan
     */
    
    public int getId()
    {
        return id;
    }

    /**
     * Metode untuk mendapatkan nama makanan
     * @return name dari makanan
     */
    
    public String getName()
    {
        return name;
    }
    
    /**
     * Metode untuk mendapatkan penjual dari makanan
     * @return seller dari penjual
     */
    
    public Seller getSeller()
    {
        return seller;
    }
    
    /**
     * Metode untuk mendapatkan harga dari makanan
     * @return price dari makanan
     */
    
    public int getPrice()
    {
        return price;
    }
    
    /**
     * Metode untuk mendapatkan kategori dari makanan
     * @return category dari makanan
     */
    
    public FoodCategory getCategory()
    {
        return category;
    }
    
    /**
     * Metode untuk merubah id makanan
     * @param id dari makanan
     */
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    /**
     * Metode untuk merubah nama makanan
     * @param name dari makanan
     */
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * Metode untuk merubah penjual makanan
     * @param seller dari makanan
     */
    
    public void setSeller(Seller seller)
    {
        this.seller = seller;
    }
    
    /**
     * Metode untuk merubah harga makanan
     * @param price dari makanan
     */
    
    public void setPrice(int price)
    {
        this.price = price;
    }
    
    /**
     * Metode untuk merubah kategori makanan
     * @param category dari makanan
     */
    
    public void setCategory(FoodCategory category)
    {
        this.category = category;
    }
    
    /**
     * Metode untuk menampilkan data
     * @return string
     */
    
    public String toString()
    {
        return "\nId = " + id +
               "\nNama = " + name + 
               "\nSeller = " + getSeller().getName() + 
               "\nCity = " + getSeller().getLocation().getCity() + 
               "\nPrice : " + price + 
               "\nCategory : " + getCategory();
    }
}