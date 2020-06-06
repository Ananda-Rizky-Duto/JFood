package AnandaRizkyDutoPamungkas.JFood;

/**
 * Kelas untuk objek promo pada JFood.
 *
 * @author Ananda Rizky Duto Pamungkas
 * @version 6 Juni 2020
 */

public class Promo
{
   private int id;
   private String code;
   private int discount;
   private int minPrice;
   private boolean active;

    /**
     * Constructor untuk objek promo
     * @param id
     * @param code
     * @param discount
     * @param minPrice
     * @param active
     */

   public Promo(int id, String code, int discount, int minPrice, boolean active)
   {
       this.id = id;
       this.code = code;
       this.discount = discount;
       this.minPrice = minPrice;
       this.active = active;
   }

    /**
     * Getter id promo
     * @return id
     */

   public int getId()
   {
       return id;
   }

    /**
     * Getter code promo
     * @return code
     */

   public String getCode()
   {
       return code;
   }

    /**
     * Getter discount atau potongan promo
     * @return discount
     */

   public int getDiscount()
   {
       return discount;
   }

    /**
     * Getter minimum price promo
     * @return minPrice
     */

   public int getMinPrice()
   {
       return minPrice;
   }

    /**
     * Getter status promo
     * @return active
     */

   public boolean getActive()
   {
       return active;
   }

    /**
     * Setter id promo
     * @param id
     */

   public void setId(int id)
   {
       this.id = id;
   }

    /**
     * Setter code promo
     * @param code
     */

   public void setCode(String code)
   {
       this.code = code;
   }

    /**
     * Setter discount promo
     * @param discount
     */
   public void setDiscount(int discount)
   {
       this.discount = discount;
   }

    /**
     * Setter minimum price promo
     * @param minPrice
     */
   public void setMinPrice(int minPrice)
   {
       this.minPrice = minPrice;
   }

    /**
     * Setter status promo
     * @param active
     */
   public void setActive(boolean active)
   {
       this.active = active;
   }

    /**
     * Menampilkan promo
     * @return string
     */
   public String toString()
   {
       return "\nId = " + id +
              "\nCode = " + code + 
              "\nDiscount : " + discount + 
              "\nMinPrice = " + minPrice + 
              "\nActive Status : " + active;
   }
}
