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
        Location location1 = new Location("DKI Jakarta", "Jakarta Barat", "Rumah Gerald");
        Location location2 = new Location("DKI Jakarta", "Jakarta Timur", "Rumah Eben");
        Location location3 = new Location("Jawa Barat", "Bogor", "Rumah Darrell");

        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId() + 1, "Milo", "milo@gmail.com", "098765432112", location1));
        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId() + 1, "Farhan", "farhan@gmail.com", "082939812921", location2));
        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId() + 1, "Hanif", "hanif@gmail.com", "082812912819", location3));

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
        try
        {
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Sashimi", DatabaseSeller.getSellerById(2), 7000, FoodCategory.Japanese));
        }
        catch(SellerNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Bakmi", DatabaseSeller.getSellerById(3), 8000, FoodCategory.Noodles));
        }
        catch(SellerNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

        ArrayList<Food> food1 = new ArrayList<>();
        try
        {
            food1.add(DatabaseFood.getFoodById(1));
        }
        catch(FoodNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

        ArrayList<Food> food2 = new ArrayList<>();
        try
        {
            food1.add(DatabaseFood.getFoodById(2));
        }
        catch(FoodNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

        ArrayList<Food> food3 = new ArrayList<>();
        try
        {
            food1.add(DatabaseFood.getFoodById(3));
        }
        catch(FoodNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

        SpringApplication.run(JFood.class, args);
    }
}
