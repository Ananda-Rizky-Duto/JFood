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

    public static void main(String[] args) throws EmailAlreadyExistsException {
        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId() + 1, "Milo", "milo@gmail.com", "098765432112", new Location("DKI Jakarta", "Jakarta Barat", "Rumah Milo")));
        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId() + 1, "Eben", "eben@gmail.com", "098327382919", new Location("Jakarta Timur", "DKI Jakarta", "Rumah Eben")));
        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId() + 1, "Darrell", "darrell@gmail.com", "083210293919", new Location("Bogor", "Jawa Barat", "Rumah Darrell")));
        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId() + 1, "Gerald", "gerald@gmail.com", "089320291236", new Location("Jakarta Barat", "DKI Jakarta", "Rumah Gerald")));
        try
        {
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Sushi", DatabaseSeller.getSellerById(1), 10000, FoodCategory.Japanese));
        }
        catch(SellerNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Sashimi", DatabaseSeller.getSellerById(1), 15000, FoodCategory.Japanese));
        }
        catch(SellerNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Beef Teriyaki", DatabaseSeller.getSellerById(1), 25000, FoodCategory.Japanese));
        }
        catch(SellerNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Spaghetti Bolognese", DatabaseSeller.getSellerById(2), 15000, FoodCategory.Western));
        }
        catch(SellerNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Spaghetti Carbonara", DatabaseSeller.getSellerById(2), 15000, FoodCategory.Western));
        }
        catch(SellerNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Mac 'n Cheese", DatabaseSeller.getSellerById(2), 15000, FoodCategory.Western));
        }
        catch(SellerNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Mie Tek tek", DatabaseSeller.getSellerById(3), 15000, FoodCategory.Noodles));
        }
        catch(SellerNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Jjajangmyon", DatabaseSeller.getSellerById(3), 25000, FoodCategory.Noodles));
        }
        catch(SellerNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Curry Ramen", DatabaseSeller.getSellerById(3), 20000, FoodCategory.Noodles));
        }
        catch(SellerNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Brownis", DatabaseSeller.getSellerById(4), 20000, FoodCategory.Bakery));
        }
        catch(SellerNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Strawberry Cheesecake", DatabaseSeller.getSellerById(4), 50000, FoodCategory.Bakery));
        }
        catch(SellerNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Macaron", DatabaseSeller.getSellerById(4), 5000, FoodCategory.Bakery));
        }
        catch(SellerNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId() + 1, "asyik", 5000, 10000, true));
        }
        catch(PromoCodeAlreadyExistsException e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "Utoy", "utoy@gmail.com", "123456Ui"));
        }
        catch (EmailAlreadyExistsException e)
        {
            e.getMessage();
        }

        SpringApplication.run(JFood.class, args);
    }
}
