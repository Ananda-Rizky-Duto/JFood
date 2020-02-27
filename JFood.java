public class JFood
{
    Location location;
    Seller seller;
    Food food;
    Customer customer;
    Invoice invoice;
    
    public static void main(String[] args)
    {
        Location location1 = new Location("Jakarta Timur", "DKI Jakarta", "Cipayung");
        System.out.println(location1.getCity());
        
        Seller seller1 = new Seller(1, "Milo", "milo@gmail.com", "098765432112", location1);
        System.out.println(seller1.getName());
        
        Food food1 = new Food(1, "Rendang", seller1, 10000, "Main Course");
        System.out.println(food1.getId());
        
        Customer customer1 = new Customer(1, "Bayu", "bayu@gmail.com", "12345678", "240220");
        System.out.println(customer1.getId());
        
        Invoice invoice1 = new Invoice(1, 1, "250220", customer1, 20000);
        System.out.println(invoice1.getId());
    }
}
