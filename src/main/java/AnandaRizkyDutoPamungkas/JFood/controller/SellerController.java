package AnandaRizkyDutoPamungkas.JFood.controller;

import AnandaRizkyDutoPamungkas.JFood.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * Kelas yang digunakan untuk mengatur akses seller pada HTTP method
 *
 * @author Ananda Rizky Duto Pamungkas
 * @version 6 Juni 2020
 */

@RequestMapping("/seller")
@CrossOrigin(origins = "*", allowedHeaders = "")
@RestController

public class SellerController
{
    @RequestMapping(value="", method = RequestMethod.GET)
    public ArrayList<Seller> getAllSeller()
    {
        return DatabaseSeller.getSellerDatabase();
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Seller getSellerById(@PathVariable int id)
    {
        Seller seller = null;
        try
        {
            seller = DatabaseSeller.getSellerById(id);
        }
        catch (SellerNotFoundException e)
        {
            e.getMessage();
            return null;
        }
        return seller;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Seller addSeller(@RequestParam(value="name") String name,
                            @RequestParam(value="email") String email,
                            @RequestParam(value="phoneNumber") String phoneNumber,
                            @RequestParam(value="description") String description,
                            @RequestParam(value="province") String province,
                            @RequestParam(value="city") String city)
    {
        Seller seller = new Seller(DatabaseSeller.getLastId() + 1, name, email, phoneNumber, new Location(province, city, description));
        if(DatabaseSeller.addSeller(seller))
        {
            return seller;
        }
        else
        {
            return null;
        }
    }
}
