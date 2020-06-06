package AnandaRizkyDutoPamungkas.JFood;

/**
 * Kelas ini digunakan sebagai exception ketika parameter yang ingin direturn tidak ada
 *
 * @author Ananda Rizky Duto Pamungkas
 * @version 6 Juni 2020
 */

public class SellerNotFoundException extends Exception
{
    private int seller_error;

    public SellerNotFoundException(int seller_input)
    {
        super("Seller ID : ");
        this.seller_error = seller_input;
    }

    /**
     * Pesan yang akan ditampilkan
     * @return id seller
     */

    public String getMessage()
    {
        return super.getMessage() + seller_error + " not found";
    }
}
