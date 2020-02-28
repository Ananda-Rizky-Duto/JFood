/**
 * Kelas ini digunakan sebagai penyimpan fungsi main
 * 
 * @author Ananda Rizky Duto Pamungkas
 * @version 27 Februari 2020
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
        Food food1 = new Food(1, "Rendang", seller1, 10000, "Main Course");
        Customer customer1 = new Customer(1, "Bayu", "bayu@gmail.com", "12345678", "240220");
        Invoice invoice1 = new Invoice(1, 1, "250220", customer1, 20000);

        System.out.println(seller1.getName());
        seller1.setName("Alwi");
        System.out.println(seller1.getName());
        food1.printData();
    }
}
