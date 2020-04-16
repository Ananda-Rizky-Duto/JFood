package AnandaRizkyDutoPamungkas.JFood.controller;

import AnandaRizkyDutoPamungkas.JFood.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/food")
@RestController

public class FoodController
{
    @RequestMapping("/")
    public ArrayList<Food> getAllFood()
    {
        return DatabaseFood.getFoodDatabase();
    }

    @RequestMapping("/food/{id}")
    public Food getFoodById(@PathVariable int id)
    {
        Food food = null;
        try
        {
            food = DatabaseFood.getFoodById(id);
        }
        catch (FoodNotFoundException e)
        {
            e.getMessage();
            return null;
        }
        return food;
    }

    @RequestMapping("/seller/{sellerId}")
    public ArrayList<Food> getFoodBySeller(@PathVariable int sellerId)
    {
        ArrayList<Food> food = null;
        food = DatabaseFood.getFoodBySeller(sellerId);
        return food;
    }

    @RequestMapping("/{category}")
    public ArrayList<Food> getFoodByCategory(@PathVariable FoodCategory category)
    {
        ArrayList<Food> food = null;
        food = DatabaseFood.getFoodByCategory(category);
        return food;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Food addFood(@RequestParam(value="name") String name,
                        @RequestParam(value="sellerId") int sellerId,
                        @RequestParam(value="price") int price,
                        @RequestParam(value="category") FoodCategory category)
    {
        try
        {
            Food food = new Food(DatabaseFood.getLastId() + 1, name, DatabaseSeller.getSellerById(sellerId), price, category);
            DatabaseFood.addFood(food);
            return food;
        }
        catch (SellerNotFoundException e)
        {
            e.getMessage();
            return null;
        }
    }
}
