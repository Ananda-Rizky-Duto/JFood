package AnandaRizkyDutoPamungkas.JFood;

/**
 * Kelas ini digunakan sebagai exception ketika parameter yang ingin direturn tidak ada
 *
 * @author Ananda Rizky Duto Pamungkas
 * @version 6 Juni 2020
 */

public class CustomerNotFoundException extends Exception
{
    private int customer_error;

    public CustomerNotFoundException(int customer_input)
    {
        super("Customer ID : ");
        this.customer_error = customer_input;
    }

    /**
     * Pesan yang akan ditampilkan
     * @return customer id
     */

    public String getMessage()
    {
        return super.getMessage() + customer_error + " not found";
    }
}
