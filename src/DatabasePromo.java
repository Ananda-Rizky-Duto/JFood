/**
 * Write a description of class DatabasePromo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;

public class DatabasePromo
{
    private static final ArrayList<Promo> PROMO_DATABASE = new ArrayList<Promo>();
    private static int lastId = 0;

    /*
     * Metode untuk menambahkan makanan pada JFood
     *
     * @return sementara false
     */

    public static ArrayList<Promo> getPromoDatabase()
    {
        return PROMO_DATABASE;
    }

    public static int getLastId()
    {
        return lastId;
    }

    public static Promo getPromoByCode(String code)
    {
        for(Promo promo : PROMO_DATABASE)
        {
            if(promo.getCode().equals(code))
            {
                return promo;
            }
        }
        return null;
    }

    public static Promo getPromoById(int id)
    {
        for(Promo promo : PROMO_DATABASE)
        {
            if(promo.getId() == id)
            {
                return promo;
            }
        }
        return null;
    }

    public static boolean addPromo(Promo promo)
    {
        for(Promo promoCheck : PROMO_DATABASE)
        {
            if(promoCheck.getCode().equals(promo.getCode()))
            {
                return false;
            }
        }
        PROMO_DATABASE.add(promo);
        lastId = promo.getId() + 1;
        return true;
    }

    public static boolean activatePromo(int id)
    {
        for(Promo promo : PROMO_DATABASE)
        {
            if(promo.getId() == id)
            {
                promo.setActive(true);
                return true;
            }
        }
        return false;
    }

    public static boolean deactivatePromo(int id)
    {
        for(Promo promo : PROMO_DATABASE)
        {
            if(promo.getId() == id)
            {
                promo.setActive(false);
                return true;
            }
        }
        return false;
    }

    public static boolean removePromo(int id)
    {
        for(Promo promo : PROMO_DATABASE)
        {
            if(promo.getId() == id)
            {
                PROMO_DATABASE.remove(promo);
                return true;
            }
        }
        return false;
    }
}
