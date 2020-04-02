/**
 * Kelas ini digunakan sebagai pengatur database penjual pada JFood.
 * 
 * @author Ananda Rizky Duto Pamungkas
 * @version 5 Maret 2020
 * 
 */
import java.util.*;

public class DatabaseSeller
{
    private static final ArrayList<Seller> SELLER_DATABASE = new ArrayList<Seller>();
    private static int lastId = 0;
    
    public static ArrayList<Seller> getSellerDatabase()
    {
        return SELLER_DATABASE;
    }

    public static int getLastId()
    {
        return lastId;
    }

    public static Seller getSellerById(int id)
    {
        for(Seller seller : SELLER_DATABASE)
        {
            if(seller.getId() == id)
            {
                return seller;
            }
        }
        return null;
    }

    public static boolean removeSeller(Seller seller)
    {
        SELLER_DATABASE.remove(seller);
        return true;
    }
    
    public static boolean addSeller(Seller seller)
    {
        SELLER_DATABASE.add(seller);
        lastId = seller.getId() + 1;
        return true;
    }

    public static boolean removeSeller(int id)
    {
        for(Seller seller : SELLER_DATABASE)
        {
            if(seller.getId() == id)
            {
                SELLER_DATABASE.remove(seller);
            }
        }
        return false;
    }
}