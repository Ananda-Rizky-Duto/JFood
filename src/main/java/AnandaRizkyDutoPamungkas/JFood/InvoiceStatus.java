package AnandaRizkyDutoPamungkas.JFood;

/**
 * Enumeration class InvoiceStatus - status dari invoice
 *
 * @author Anadna Rizky Duto Pamungkas
 * @version 6 Maret 2020
 */
public enum InvoiceStatus
{
    Ongoing("Ongoing"),
    Finished("Finished"),
    Cancelled("Cancelled");
    
    public String toString()
    {
        return status;
    }
    
    private String status;
    
    InvoiceStatus(String status)
    {
        this.status = status;
    }
}
