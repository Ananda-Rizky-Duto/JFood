package AnandaRizkyDutoPamungkas.JFood;

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
    //Tugas 8
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

    public static Customer getCustomerById(int id) throws CustomerNotFoundException
    {
        for(Customer customer : CUSTOMER_DATABASE)
        {
            if(customer.getId() == id)
            {
                return customer;
            }
        }
        throw new CustomerNotFoundException(id);
    }

    public static boolean addCustomer(Customer customer) throws EmailAlreadyExistsException
    {
        for(Customer customerCheck : CUSTOMER_DATABASE)
        {
            if(customer.getEmail().equals(customerCheck.getEmail()))
            {
                throw new EmailAlreadyExistsException(customer);
            }
        }
        CUSTOMER_DATABASE.add(customer);
        lastId = customer.getId();
        return true;
    }

    public static boolean removeCustomer(int id) throws CustomerNotFoundException
    {
        for(Customer customer : CUSTOMER_DATABASE)
        {
            if(customer.getId() == id)
            {
                CUSTOMER_DATABASE.remove(customer);
                return true;
            }
        }
        throw new CustomerNotFoundException(id);
    }

    public static Customer customerLogin(String email, String password)
    {
        for(Customer customer : CUSTOMER_DATABASE)
        {
            if(email.equals(customer.getEmail()) && password.equals(customer.getPassword()))
            {
                return customer;
            }
        }

        return null;
    }
}
