package AnandaRizkyDutoPamungkas.JFood.controller;

import AnandaRizkyDutoPamungkas.JFood.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/customer")
@CrossOrigin(origins = "*", allowedHeaders = "")
@RestController

public class CustomerController
{
    @RequestMapping(value="", method = RequestMethod.GET)
    public ArrayList<Customer> getAllCustomer() {
        return DatabaseCustomer.getCustomerDatabase();
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST )
    public Customer loginCustomer(@RequestParam(value="email") String email,
                                  @RequestParam(value="password") String password)
    {
        return DatabaseCustomer.customerLogin(email, password);
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Customer getCustomerById(@PathVariable int id)
    {
        Customer customer = null;
        try
        {
            customer = DatabaseCustomer.getCustomerById(id);
        }
        catch (CustomerNotFoundException e)
        {
            e.getMessage();
            return null;
        }
        return customer;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Customer registerCustomer(@RequestParam(value="name") String name,
                                @RequestParam(value="email") String email,
                                @RequestParam(value="password") String password)
    {
        Customer customer = new Customer(DatabaseCustomer.getLastId() + 1, name, email, password);
        try
        {
            DatabaseCustomer.addCustomer(customer);
        }
        catch (EmailAlreadyExistsException e)
        {
            e.getMessage();
            return null;
        }
        return customer;
    }
}