public class PriceCalculator implements Runnable
{
    Invoice invoice;

    @Override
    public void run()
    {
        System.out.println("Calculating invoice id : " + invoice.getId());
        invoice.setTotalPrice();
        System.out.println("Finish calculating invoice id : " + invoice.getId());
    }
}
