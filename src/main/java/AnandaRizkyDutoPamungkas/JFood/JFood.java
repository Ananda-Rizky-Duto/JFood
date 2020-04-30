package AnandaRizkyDutoPamungkas.JFood;

import java.util.ArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Kelas ini digunakan sebagai penyimpan fungsi main
 * 
 * @author Ananda Rizky Duto Pamungkas
 * @version 5 Maret 2020
 * 
 */
@SpringBootApplication
public class JFood
{
    /*
     * Metode main yang digunakan untuk mengisi objek dari beberapa kelas
     */

    public static void main(String[] args)
    {
        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId() + 1, "Milo", "milo@gmail.com", "098765432112", new Location("DKI Jakarta", "Jakarta Barat", "Rumah Milo")));
        try
        {
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Sushi", DatabaseSeller.getSellerById(1), 3000, FoodCategory.Japanese));
        }
        catch(SellerNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Bolognese", DatabaseSeller.getSellerById(1), 15000, FoodCategory.Western));
        }
        catch(SellerNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        SpringApplication.run(JFood.class, args);
    }
}
