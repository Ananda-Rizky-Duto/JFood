package AnandaRizkyDutoPamungkas.JFood;

/**
 * Kelas ini digunakan sebagai exception ketika parameter yang ingin direturn tidak ada
 *
 * @author Ananda Rizky Duto Pamungkas
 * @version 6 Juni 2020
 */

public class FoodNotFoundException extends Exception
{
    private int food_error;

    public FoodNotFoundException(int food_input)
    {
        super("Food ID : ");
        this.food_error = food_input;
    }

    /**
     * Pesan yang akan ditampilkan
     * @return food id
     */

    public String getMessage()
    {
        return super.getMessage() + food_error + " not found";
    }
}
