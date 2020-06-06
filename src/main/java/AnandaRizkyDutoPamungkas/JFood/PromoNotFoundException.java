package AnandaRizkyDutoPamungkas.JFood;

/**
 * Kelas ini digunakan sebagai exception ketika parameter yang ingin direturn tidak ada
 *
 * @author Ananda Rizky Duto Pamungkas
 * @version 6 Juni 2020
 */

public class PromoNotFoundException extends Exception
{
    private int promo_error;

    public PromoNotFoundException(int promo_input)
    {
        super("Promo ID : ");
        this.promo_error = promo_input;
    }

    /**
     * Pesan yang akan ditampilkan
     * @return code promo
     */

    public String getMessage()
    {
        return super.getMessage() + promo_error + " not found";
    }
}
