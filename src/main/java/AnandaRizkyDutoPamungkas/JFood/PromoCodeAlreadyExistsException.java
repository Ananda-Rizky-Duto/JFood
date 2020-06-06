package AnandaRizkyDutoPamungkas.JFood;

/**
 * Kelas ini digunakan sebagai exception ketika parameter yang ingin direturn tidak ada
 *
 * @author Ananda Rizky Duto Pamungkas
 * @version 6 Juni 2020
 */

public class PromoCodeAlreadyExistsException extends Exception
{
    private Promo promo_error;

    public PromoCodeAlreadyExistsException(Promo promo_input)
    {
        super("Promo Code : ");
        this.promo_error = promo_input;
    }

    /**
     * Pesan yang akan ditampilkan
     * @return code promo
     */

    public String getMessage()
    {
        return super.getMessage() + promo_error.getCode() + " already exists";
    }
}
