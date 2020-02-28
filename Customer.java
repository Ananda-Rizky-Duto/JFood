/**
 * Kelas ini digunakan untuk getter data pelanggan pada JFood.
 * 
 * @author Ananda Rizky Duto Pamungkas
 * @version 27 Februari 2020
 * 
 */
    
public class Customer
{
    private int id;
    private String name;
    private String email;
    private String password;
    private String joinDate;

    /*
     * Metode untuk melakukan referensi dari suatu objek private pada kelas
     */
    
    public Customer(int id, String name, String email, String password, String joinDate)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
    }

    /*
     * Metode untuk mendapatkan id pelanggan
     * 
     * @return id dari pelanggan
     */
    
    public int getId()
    {
        return id;
    }

    /*
     * Metode untuk mendapatkan nama pelanggan
     * 
     * @return name dari pelanggan
     */
        
    public String getName()
    {
        return name;
    }

    /*
     * Metode untuk mendapatkan email pelanggan
     * 
     * @return email dari pelanggan
     */
        
    public String getEmail()
    {
        return email;
    }

    /*
     * Metode untuk mendapatkan password pelanggan
     * 
     * @return password dari pelanggan
     */
        
    public String getPassword()
    {
        return password;
    }

    /*
     * Metode untuk mendapatkan waktu membuat akun dari pelanggan
     * 
     * @return joinDate dari pelanggan
     */
        
    public String getJoinDate()
    {
        return joinDate;
    }

    /*
     * Metode untuk merubah id pelanggan
     * 
     * @return id dari pelanggan
     */
        
    public void setId(int id)
    {
        this.id = id;
    }

    /*
     * Metode untuk merubah nama pelanggan
     * 
     * @return name dari pelanggan
     */
        
    public void setName(String name)
    {
        this.name = name;
    }

    /*
     * Metode untuk merubah email pelanggan
     * 
     * @return email dari pelanggan
     */
        
    public void setEmail(String email)
    {
        this.email = email;
    }

    /*
     * Metode untuk merubah password pelanggan
     * 
     * @return password dari pelanggan
     */
        
    public void setPassword(String password)
    {
        this.password = password;
    }

    /*
     * Metode untuk merubah waktu membuat akun
     * 
     * @return joinDate dari pelanggan
     */
        
    public void setJoinDate(String joinDate)
    {
        this.joinDate = joinDate;
    }

    /*
     * Metode untuk menampilkan data
     * 
     * @return name dari pelanggan
     */
        
    public void printData()
    {
        System.out.println(this.name);
    }
}
