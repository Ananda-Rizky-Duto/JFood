package AnandaRizkyDutoPamungkas.JFood;

public class CustomerNotFoundException extends Exception
{
    //Modul 7
    private int customer_error;

    public CustomerNotFoundException(int customer_input)
    {
        super("Customer ID : ");
        this.customer_error = customer_input;
    }

    public String getMessage()
    {
        return super.getMessage() + customer_error + " not found";
    }
}
