package AnandaRizkyDutoPamungkas.JFood;

/**
 * Kelas ini digunakan sebagai exception ketika parameter yang ingin direturn tidak ada
 *
 * @author Ananda Rizky Duto Pamungkas
 * @version 6 Juni 2020
 */

public class InvoiceNotFoundException extends Exception
{
    private int invoice_error;

    public InvoiceNotFoundException(int invoice_input)
    {
        super("Invoice ID : ");
        this.invoice_error = invoice_input;
    }

    /**
     * Pesan yang akan ditampilkan
     * @return invoice id
     */

    public String getMessage()
    {
        return super.getMessage() + invoice_error + " not found";
    }
}
