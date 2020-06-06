package AnandaRizkyDutoPamungkas.JFood.controller;

import AnandaRizkyDutoPamungkas.JFood.*;
import org.springframework.web.bind.annotation.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

/**
 * Kelas yang digunakan untuk mengatur akses seller pada HTTP method
 *
 * @author Ananda Rizky Duto Pamungkas
 * @version 6 Juni 2020
 */

@RequestMapping("/customer")
@CrossOrigin(origins = "*", allowedHeaders = "")
@RestController

public class CustomerController
{
    @RequestMapping(value="", method = RequestMethod.GET)
    public ArrayList<Customer> getAllCustomer() {
        return DatabaseCustomerPostgres.getCustomerDatabase();
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST )
    public Customer loginCustomer(@RequestParam(value="email") String email,
                                  @RequestParam(value="password") String password)
    {
        return DatabaseCustomerPostgres.customerLogin(email, password);
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Customer getCustomerById(@PathVariable int id)
    {
        return DatabaseCustomerPostgres.getCustomerById(id);
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Customer registerCustomer(@RequestParam(value="name") String name,
                                @RequestParam(value="email") String email,
                                @RequestParam(value="password") String password)
    {
        String regexEmail = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
        Pattern patternEmail = Pattern.compile(regexEmail);
        Matcher matcherEmail = patternEmail.matcher(email);

        String regexPass = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";
        Pattern patternPass = Pattern.compile(regexPass);
        Matcher matcherPass = patternPass.matcher(password);
        if(matcherEmail.matches() && matcherPass.matches()){
            Customer customer = new Customer(DatabaseCustomerPostgres.getLastId()+1, name, email, password);
            return DatabaseCustomerPostgres.addCustomer(customer);
        }
        return null;
    }

    @RequestMapping(value = "/remove/{id}", method = RequestMethod.DELETE)
    public boolean removeCustomer(@PathVariable int id)
    {
        return DatabaseCustomerPostgres.removeCustomer(id);
    }
}