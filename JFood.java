/**
 * Kelas ini digunakan sebagai penyimpan fungsi main
 * 
 * @author Ananda Rizky Duto Pamungkas
 * @version 5 Maret 2020
 * 
 */

import java.util.*;
import java.text.*;
import java.util.regex.*;

public class JFood
{
    Location location;
    Seller seller;
    Food food;
    Customer customer;
    Invoice invoice;
    
    /*
     * Metode main yang digunakan untuk mengisi objek dari beberapa kelas
     */
    
    public static void main(String[] args)
    {
        Location location1 = new Location("Jakarta Timur", "DKI Jakarta", "Cipayung");
        Seller seller1 = new Seller(1, "Milo", "milo@gmail.com", "098765432112", location1);
        Food food1 = new Food(1, "Sushi", seller1, 3000, FoodCategory.Japanese);
        Food food2 = new Food(2, "Sashimi", seller1, 7000, FoodCategory.Japanese);
        Food food3 = new Food(3, "Ramen", seller1, 15000, FoodCategory.Japanese);
        //Customer customer1 = new Customer(1, "Bayu", "bayu@gmail.com", "12345678", "240220");
        Promo promo1 = new Promo(1, "aselole", 2000, 5000, true);
        /*
        System.out.println("=====Modul 4=====");
        CashlessInvoice cashlessInvoice1 = new CashlessInvoice(1, food2, "15/3/2020", customer1, InvoiceStatus.Ongoing);
        CashlessInvoice cashlessInvoice2 = new CashlessInvoice(2, food1, "16/3/2020", customer1, InvoiceStatus.Ongoing, promo1);
        CashlessInvoice cashlessInvoice3 = new CashlessInvoice(3, food3, "17/3/2020", customer1, InvoiceStatus.Ongoing, promo1);
        
        cashlessInvoice1.setTotalPrice();
        cashlessInvoice2.setTotalPrice();
        cashlessInvoice3.setTotalPrice();
        
        cashlessInvoice1.printData();
        cashlessInvoice2.printData();
        cashlessInvoice3.printData();
        
        System.out.println("\n=====Post Test Modul 4=====");
        CashInvoice cashInvoice1 = new CashInvoice(1, food1, "15/3/2020", customer1, InvoiceStatus.Finished, 0);
        CashInvoice cashInvoice2 = new CashInvoice(2, food1, "15/3/2020", customer1, InvoiceStatus.Finished, 4000);
        
        cashInvoice1.setTotalPrice();
        cashInvoice2.setTotalPrice();
        
        cashInvoice1.printData();
        cashInvoice2.printData();
        */
        System.out.println("=====Modul 5=====\n");
        
        Calendar calendar1 = new GregorianCalendar(2020, 03, 01);
        Customer customer1 = new Customer(1, "Gerald", ".geraldCihuy@gmail.com", "1234", calendar1);
        Customer customer2 = new Customer(2, "Eben", "eben@gmail.com", "123456Ui", 2020, 03, 02);
        Customer customer3 = new Customer(3, "Darrell", "darrell@gmail.com", "123456Ui");
        
        System.out.println(customer1 + "\n");
        System.out.println(customer2 + "\n");
        System.out.println(customer3 + "\n");
        
        customer1.setEmail("gerald@gmail.com");
        customer1.setPassword("123456Ui");
        System.out.println(customer1 + "\n");
        
        System.out.println("=====Post Test Modul 5=====\n");
        CashlessInvoice cashlessInvoice1 = new CashlessInvoice(1, food2, customer1, InvoiceStatus.Ongoing, promo1);
        CashInvoice cashInvoice1 = new CashInvoice(1, food1, customer1, InvoiceStatus.Finished, 4000); 
        
        cashlessInvoice1.setTotalPrice();
        cashInvoice1.setTotalPrice();
        
        System.out.println(cashlessInvoice1 + "\n");
        System.out.println(cashInvoice1 + "\n");
    }
}
