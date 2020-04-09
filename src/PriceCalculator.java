public class PriceCalculator implements Runnable
{
    //Tugas 9
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
