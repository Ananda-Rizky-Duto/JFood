/**
 * Kelas ini digunakan sebagai database pelanggan pada JFood
 *
 * @author Ananda Rizky Duto Pamungkas
 * @version 5 Maret 2020
 * 
 */

import java.util.*;

public class DatabaseCustomer
{
    private static final ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<Customer>();
    private static int lastId = 0;

    public static ArrayList<Customer> getCustomerDatabase()
    {
        return CUSTOMER_DATABASE;
    }

    public static int getLastId()
    {
        return lastId;
    }

    public static Customer getCustomerById(int id)
    {
        for(Customer customer : CUSTOMER_DATABASE)
        {
            if(customer.getId() == id)
            {
                return customer;
            }
        }
        return null;
    }

    public static boolean addCustomer(Customer customer)
    {
        for(Customer customerCheck : CUSTOMER_DATABASE)
        {
            if(customer.getEmail().equals(customerCheck.getEmail()))
            {
                return false;
            }
        }
        CUSTOMER_DATABASE.add(customer);
        lastId = customer.getId();
        return true;
    }

    public static boolean removeCustomer(int id)
    {
        for(Customer customer : CUSTOMER_DATABASE)
        {
            if(customer.getId() == id)
            {
                CUSTOMER_DATABASE.remove(customer);
                return true;
            }
        }
        return false;
    }
}
