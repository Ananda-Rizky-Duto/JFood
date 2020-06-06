package AnandaRizkyDutoPamungkas.JFood;

/**
 * Kelas yang digunakan untuk menghitung total price menggunakan thread
 *
 * @author Ananda Rizky Duto Pamungkas
 * @version 6 Juni 2020
 */

public class PriceCalculator implements Runnable
{
    Invoice invoice;
    public PriceCalculator(Invoice invoice)
    {
        this.invoice = invoice;
    }

    @Override
    public void run()
    {
        System.out.println("Calculating invoice id : " + invoice.getId());
        invoice.setTotalPrice();
        System.out.println("Finish calculating invoice id : " + invoice.getId());
    }
}
