package AnandaRizkyDutoPamungkas.JFood;

/**
 * Enumeration class PaymentType - jenis cara pembayaran
 *
 * @author Ananda Rizky Duto Pamungkas
 * @version 5 Maret 2020
 * 
 */

public enum PaymentType
{
    Cashless("Cashless"),
    Cash("Cash");
    
    public String toString()
    {
        return paymentType;
    }
    
    private String paymentType;
    
    PaymentType(String paymentType)
    {
        this.paymentType = paymentType;
    }
}