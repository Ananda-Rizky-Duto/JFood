import java.util.ArrayList;

/**
 * Kelas ini digunakan sebagai penyimpan fungsi main
 * 
 * @author Ananda Rizky Duto Pamungkas
 * @version 5 Maret 2020
 * 
 */

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
        //Seller seller1 = new Seller(1, "Milo", "milo@gmail.com", "098765432112", location1);
        //Food food1 = new Food(1, "Sushi", seller1, 3000, FoodCategory.Japanese);
        //Food food2 = new Food(2, "Sashimi", seller1, 7000, FoodCategory.Japanese);
        //Food food3 = new Food(3, "Bolognese", seller1, 15000, FoodCategory.Western);
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

        /*
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
         */
        /*
        System.out.println("=====Modul 6 Case Study=====\n");
        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId() + 1, "Milo", "milo@gmail.com", "098765432112", location1));
        DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "Duto", "duto@gmail.com", "123456Ua", 2020, 3, 2));
        DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "Duto", "duto@gmail.com", "123456Ui", 2020, 3, 3));
        DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "Alwi", "alwi@gmail.com", "123456Ue", 2020, 3, 4));
        System.out.println("Customer");
        for(Customer customer : DatabaseCustomer.getCustomerDatabase())
        {
            System.out.println(customer.toString());
        }
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Sushi", DatabaseSeller.getSellerById(1), 3000, FoodCategory.Japanese));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Sashimi", DatabaseSeller.getSellerById(1), 7000, FoodCategory.Japanese));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Bolognese", DatabaseSeller.getSellerById(1), 15000, FoodCategory.Western));
        System.out.println("\nWestern Food");
        for(Food food : DatabaseFood.getFoodByCategory(FoodCategory.Western))
        {
            System.out.println(food.toString());
        }
        System.out.println("\nJapanese Food");
        for(Food food : DatabaseFood.getFoodByCategory(FoodCategory.Japanese))
        {
            System.out.println(food.toString() + "\n");
        }
         */
        /*
        System.out.println("=====Modul 6 Post Test=====\n");
        DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "Duto", "duto@gmail.com", "123456Ua", 2020, 3, 2));
        DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "Duto", "duto@gmail.com", "123456Ui", 2020, 3, 3));
        DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "Alwi", "alwi@gmail.com", "123456Ue", 2020, 3, 4));
        //Tambahkan 2 promo ke database
        DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId() + 1, "asyique", 2000, 5000, false));
        DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId() + 1, "asyique", 1000, 4000, true));
        System.out.println("Promo Avaiable\n");
        for(Promo promo : DatabasePromo.getPromoDatabase())
        {
            System.out.println(promo.toString());
        }
        //Tambahkan 2 food arraylist
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Sushi", DatabaseSeller.getSellerById(1), 3000, FoodCategory.Japanese));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Sashimi", DatabaseSeller.getSellerById(1), 7000, FoodCategory.Japanese));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Bolognese", DatabaseSeller.getSellerById(1), 15000, FoodCategory.Western));
        ArrayList<Food> food1 = new ArrayList<Food>();
        food1.add(DatabaseFood.getFoodById(1));
        ArrayList<Food> food2 = new ArrayList<Food>();
        food2.add(DatabaseFood.getFoodById(2));
        //Tambahkan CashInvoice dan setTotalPrice
        DatabaseInvoice.addInvoice(new CashInvoice(DatabaseInvoice.getLastId() + 1, food1, DatabaseCustomer.getCustomerById(1), 2000));
        DatabaseInvoice.getInvoiceByCustomer(1).get(DatabaseInvoice.getInvoiceByCustomer(1).size()-1).setTotalPrice();
        //Tambahkan CashlessInvoice dan setTotalPrice
        DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId() + 1, food2, DatabaseCustomer.getCustomerById(1), DatabasePromo.getPromoById(1)));
        DatabaseInvoice.getInvoiceByCustomer(1).get(DatabaseInvoice.getInvoiceByCustomer(1).size()-1).setTotalPrice();
        //Ganti status invoice customer 1
        DatabaseInvoice.changeInvoiceStatus(1, InvoiceStatus.Finished);
        DatabaseInvoice.changeInvoiceStatus(2, InvoiceStatus.Finished);
        for(Invoice invoice : DatabaseInvoice.getInvoiceDatabase())
        {
            System.out.println(invoice.toString());
        }
        //Tambahkan cashless invoice customer 2
        DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId() + 1, food2, DatabaseCustomer.getCustomerById(2), DatabasePromo.getPromoById(1)));
        //Ganti status promo menjadi aktif
        DatabasePromo.activatePromo(1);
        System.out.println("\n\nPromo Avaiable\n");
        for(Promo promo : DatabasePromo.getPromoDatabase())
        {
            System.out.println(promo.toString());
        }
        //Set total price seluruh isi invoice
        for(Invoice invoice : DatabaseInvoice.getInvoiceDatabase())
        {
            invoice.setTotalPrice();
        }
        //Print seluruh invoice
        for(Invoice invoice : DatabaseInvoice.getInvoiceDatabase())
        {
            System.out.println(invoice.toString());
        }
        */

        System.out.println("=====Modul 7 Case Study=====\n");
        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId() + 1, "Milo", "milo@gmail.com", "098765432112", location1));
        try
        {
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "Duto", "duto@gmail.com", "123456Ua", 2020, 3, 2));
        }
        catch(EmailAlreadyExistsException e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "Ayoy", "ayoy@gmail.com", "123456Ui", 2020, 3, 3));
        }
        catch(EmailAlreadyExistsException e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "Utoy", "utoy@gmail.com", "123456Ue", 2020, 3, 4));
        }
        catch(EmailAlreadyExistsException e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "Farhan", "duto@gmail.com", "123456Uo", 2020, 3, 5));
        }
        catch(EmailAlreadyExistsException e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId() + 1, "asyique", 2000, 5000, true));
        }
        catch(PromoCodeAlreadyExistsException e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId() + 1, "asyique", 1000, 4000, true));
        }
        catch(PromoCodeAlreadyExistsException e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Sushi", DatabaseSeller.getSellerById(1), 3000, FoodCategory.Japanese));
        }
        catch(SellerNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Bolognese", DatabaseSeller.getSellerById(1), 15000, FoodCategory.Western));
        }
        catch(SellerNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Sashimi", DatabaseSeller.getSellerById(1), 7000, FoodCategory.Japanese));
        }
        catch(SellerNotFoundException e)
        {
            System.out.println(e.getMessage());
        }


        try
        {
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "Hanif", "hanif@gmail.com", "123456Ue", 2020, 3, 6));
        }
        catch(EmailAlreadyExistsException e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            System.out.println(DatabasePromo.getPromoById(10));
        }
        catch(PromoNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            System.out.println(DatabaseFood.getFoodById(10));
        }
        catch(FoodNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            System.out.println(DatabaseCustomer.getCustomerById(10));
        }
        catch(CustomerNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            System.out.println(DatabaseSeller.getSellerById(10));
        }
        catch(SellerNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("\nCustomer");
        for(Customer customer : DatabaseCustomer.getCustomerDatabase())
        {
            System.out.println(customer.toString());
        }

        System.out.println("\nFood");
        for(Food food : DatabaseFood.getFoodDatabase())
        {
            System.out.println(food.toString());
        }

        System.out.println("\nPromo");
        for(Promo promo : DatabasePromo.getPromoDatabase())
        {
            System.out.println(promo.toString());
        }
        System.out.println();

        ArrayList<Food> food1 = new ArrayList<>();
        try
        {
            food1.add(DatabaseFood.getFoodById(1));
        }
        catch(FoodNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("=====Modul 7 Post Test=====\n");
        try
        {
            DatabaseInvoice.addInvoice(new CashInvoice(DatabaseInvoice.getLastId() + 1, food1, DatabaseCustomer.getCustomerById(1), 2000));
        }
        catch(CustomerNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        catch(OngoingInvoiceAlreadyExistsException e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            DatabaseInvoice.getInvoiceById(10);
        }
        catch(InvoiceNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            DatabaseInvoice.getInvoiceById(15);
        }
        catch(InvoiceNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            DatabaseInvoice.addInvoice(new CashInvoice(DatabaseInvoice.getLastId(), food1, DatabaseCustomer.getCustomerById(2), 3000));
        }
        catch(CustomerNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        catch(OngoingInvoiceAlreadyExistsException e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            DatabaseInvoice.addInvoice(new CashInvoice(DatabaseInvoice.getLastId(), food1, DatabaseCustomer.getCustomerById(3), 4000));
        }
        catch(CustomerNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        catch(OngoingInvoiceAlreadyExistsException e)
        {
            System.out.println(e.getMessage());
        }

        /*
        //Tugas 9
        for(Invoice invoice : DatabaseInvoice.getInvoiceDatabase())
        {
            Thread calculate = new Thread(new PriceCalculator(invoice));
            calculate.start();
        }*/

    }
}
