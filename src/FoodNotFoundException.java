public class FoodNotFoundException extends Exception
{
    //Modul 7
    private int food_error;

    public FoodNotFoundException(int food_input)
    {
        super("Food ID : ");
        this.food_error = food_input;
    }

    public String getMessage()
    {
        return super.getMessage() + food_error + " not found";
    }
}
