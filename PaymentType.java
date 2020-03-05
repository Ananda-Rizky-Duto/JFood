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
        return PaymentType;
    }
    
    private String PaymentType;
    
    PaymentType(String PaymentType)
    {
        this.PaymentType = PaymentType;
    }
}