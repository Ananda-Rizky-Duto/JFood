/**
 * Kelas ini digunakan untuk database makanan pada JFood.
 * 
 * @author Ananda Rizky Duto Pamungkas
 * @version 27 Februari 2020
 * 
 */

public class DatabaseFood
{
    private String[] listFood;
    
    public DatabaseFood()
    {
        
    }
    
    /*
     * Metode untuk menambahkan makanan pada JFood
     * 
     * @return sementara false
     */
    
    public boolean addFood(Food food)
    {
        return false;
    }
    
    /*
     * Metode untuk menghapus makanan pada JFood
     * 
     * @return sementara false
     */
    
    public boolean removeFood(Food food)
    {
        return false;
    }
    
    /*
     * Metode untuk mendapatkan makanan pada JFood
     * 
     * @return sementara null
     */
    
    public Food getFood()
    {
        return null;
    }
    
    /*
     * Metode untuk mendapatkan daftar makanan pada JFood
     * 
     * @return listFood dari database
     */
    
    public String[] getListFood()
    {
        return listFood;
    }
}
