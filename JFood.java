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
        Seller seller1 = new Seller(1, "Milo", "milo@gmail.com", "098765432112", location1);
        Food food1 = new Food(1, "Sushi", seller1, 3000, FoodCategory.Japanese);
        Food food2 = new Food(2, "Sashimi", seller1, 7000, FoodCategory.Japanese);
        Food food3 = new Food(3, "Ramen", seller1, 15000, FoodCategory.Japanese);
        Customer customer1 = new Customer(1, "Bayu", "bayu@gmail.com", "12345678", "240220");
        Promo promo1 = new Promo(1, "aselole", 2000, 5000, true);
        CashlessInvoice cashlessInvoice1 = new CashlessInvoice(1, food2, "15/3/2020", customer1, InvoiceStatus.Ongoing);
        CashlessInvoice cashlessInvoice2 = new CashlessInvoice(2, food1, "16/3/2020", customer1, InvoiceStatus.Ongoing, promo1);
        CashlessInvoice cashlessInvoice3 = new CashlessInvoice(3, food3, "17/3/2020", customer1, InvoiceStatus.Ongoing, promo1);
        
        cashlessInvoice1.setTotalPrice();
        cashlessInvoice2.setTotalPrice();
        cashlessInvoice3.setTotalPrice();
        
        cashlessInvoice1.printData();
        cashlessInvoice2.printData();
        cashlessInvoice3.printData();
    }
}
