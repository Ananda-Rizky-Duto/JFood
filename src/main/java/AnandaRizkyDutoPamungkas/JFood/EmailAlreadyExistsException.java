package AnandaRizkyDutoPamungkas.JFood;

/**
 * Kelas ini digunakan sebagai exception ketika parameter yang ingin direturn tidak ada
 *
 * @author Ananda Rizky Duto Pamungkas
 * @version 6 Juni 2020
 */

public class EmailAlreadyExistsException extends Exception
{
    private Customer customer_error;

    public EmailAlreadyExistsException(Customer customer_input)
    {
        super("Customer Email : ");
        this.customer_error = customer_input;
    }

    /**
     * Pesan yang akan ditampilkan
     * @return customer id
     */

    public String getMessage()
    {
        return super.getMessage() + customer_error.getEmail() + " already exists";
    }
}
