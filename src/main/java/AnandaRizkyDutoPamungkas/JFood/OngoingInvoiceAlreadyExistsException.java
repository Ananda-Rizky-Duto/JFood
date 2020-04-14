package AnandaRizkyDutoPamungkas.JFood;

public class OngoingInvoiceAlreadyExistsException extends Exception
{
    private Invoice invoice_error;

    public OngoingInvoiceAlreadyExistsException(Invoice invoice_input)
    {
        super("Ongoing Invoice");
        this.invoice_error = invoice_input;
    }

    public String getMessage()
    {
        return super.getMessage() + ", Invoice ID : " + invoice_error.getId();
    }
}
