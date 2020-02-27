public class Customer
{
    /**
     * Kelas ini digunakan untuk getter data pelanggan pada JFood.
     * 
     * @author Ananda Rizky Duto Pamungkas
     * @version 27 Februari 2020
     * 
     */
    
    private int id;
    private String name;
    private String email;
    private String password;
    private String joinDate;

    public Customer(int id, String name, String email, String password, String joinDate)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
    }

    /*
     * Metode untuk mendapatkan id
     * 
     * @return id dari pelanggan
     */
    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public String getJoinDate()
    {
        return joinDate;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public void setJoinDate(String joinDate)
    {
        this.joinDate = joinDate;
    }
    
    public void printData()
    {
        System.out.println(this.name);
    }
}
