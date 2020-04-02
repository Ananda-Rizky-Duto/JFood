/**
 * Kelas ini digunakan untuk database makanan pada JFood.
 * 
 * @author Ananda Rizky Duto Pamungkas
 * @version 5 Maret 2020
 * 
 */
import java.util.*;

public class DatabaseFood
{
    private static final ArrayList<Food> FOOD_DATABASE = new ArrayList<Food>();
    private static int lastId = 0;
    
    /*
     * Metode untuk menambahkan makanan pada JFood
     * 
     * @return sementara false
     */

    public static ArrayList<Food> getFoodDatabase()
    {
        return FOOD_DATABASE;
    }

    public static int getLastId()
    {
        return lastId;
    }

    public static Food getFoodById(int id)
    {
        for(Food food : FOOD_DATABASE)
        {
            if(food.getId() == id)
            {
                return food;
            }
        }
        return null;
    }

    public static ArrayList<Food> getFoodBySeller(int sellerId)
    {
        ArrayList<Food> foodList = new ArrayList<Food>();
        for(Food food : FOOD_DATABASE)
        {
            if(food.getSeller().getId() == sellerId)
            {
                foodList.add(food);
            }
        }
        return foodList;
    }

    public static ArrayList<Food> getFoodByCategory(FoodCategory category)
    {
        ArrayList<Food> foodList = new ArrayList<Food>();
        for(Food food : FOOD_DATABASE)
        {
            if(food.getCategory().equals(category))
            {
                foodList.add(food);
            }
        }
        return foodList;
    }

    public static boolean addFood(Food food)
    {
        FOOD_DATABASE.add(food);
        lastId = food.getId() + 1;
        return true;
    }

    public static boolean removeFood(int id)
    {
        for(Food food : FOOD_DATABASE)
        {
            if(food.getId() == id)
            {
                FOOD_DATABASE.remove(food);
            }
        }
        return false;
    }
}
