package AnandaRizkyDutoPamungkas.JFood.controller;

import AnandaRizkyDutoPamungkas.JFood.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/promo")
@RestController

public class PromoController
{
    @RequestMapping("")
    public ArrayList<Promo> getAllPromo()
    {
        return DatabasePromo.getPromoDatabase();
    }

    @RequestMapping("/{code}")
    public Promo getPromoByCode(@PathVariable String code)
    {
        Promo promo = null;
        promo = DatabasePromo.getPromoByCode(code);
        return promo;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Promo addPromo(@RequestParam(value="code") String code,
                          @RequestParam(value="discount") int discount,
                          @RequestParam(value="minPrice") int minPrice,
                          @RequestParam(value="active") boolean active)
    {
        try
        {
            Promo promo = new Promo(DatabasePromo.getLastId() + 1, code, discount, minPrice, active);
            DatabasePromo.addPromo(promo);
            return promo;
        }
        catch(PromoCodeAlreadyExistsException e)
        {
            e.getMessage();
            return null;
        }
    }
}
