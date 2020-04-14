package AnandaRizkyDutoPamungkas.JFood;

/**
 * Enumeration class PaymentType - kategory makanan
 * 
 * @author Ananda Rizky Duto Pamungkas
 * @version 5 Maret 2020
 * 
 */

public enum FoodCategory
{
    Beverages("Beverages"),
    Coffee("Coffee"),
    Western("Western"),
    Snacks("Snacks"),
    Rice("Rice"),
    Noodles("Noodles"),
    Bakery("Bakery"),
    Japanese("Japanese");
    
    private String category;

    public String toString()
    {
        return category;
    }

    FoodCategory(String category)
    {
        this.category = category;
    }
}