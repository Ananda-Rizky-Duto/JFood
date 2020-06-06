package AnandaRizkyDutoPamungkas.JFood.controller;

import AnandaRizkyDutoPamungkas.JFood.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * Kelas yang digunakan untuk mengatur akses promo pada HTTP method
 *
 * @author Ananda Rizky Duto Pamungkas
 * @version 6 Juni 2020
 */

@RequestMapping("/promo")
@CrossOrigin(origins = "*", allowedHeaders = "")
@RestController

public class PromoController
{
    @RequestMapping(value="", method = RequestMethod.GET)
    public ArrayList<Promo> getAllPromo()
    {
        return DatabasePromoPostgres.getPromoDatabase();
    }

    @RequestMapping(value="/{code}", method = RequestMethod.GET)
    public Promo getPromoByCode(@PathVariable String code)
    {
        Promo promo = null;
        promo = DatabasePromoPostgres.getPromoByCode(code);
        return promo;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Promo addPromo(@RequestParam(value="code") String code,
                          @RequestParam(value="discount") int discount,
                          @RequestParam(value="minPrice") int minPrice,
                          @RequestParam(value="active") boolean active)
    {
        Promo promo = new Promo(DatabasePromo.getLastId() + 1, code, discount, minPrice, active);
        DatabasePromoPostgres.addPromo(promo);
        return promo;
    }
}
