/**
 * Kelas ini digunakan untuk getter data pelanggan pada JFood.
 * 
 * @author Ananda Rizky Duto Pamungkas
 * @version 27 Februari 2020
 * 
 */

import java.util.*;
import java.text.*;
import java.util.regex.*;
import java.text.SimpleDateFormat;  
import java.util.Date; 

public class Customer
{
    private int id;
    private String name;
    private String email;
    private String password;
    private Calendar joinDate;
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$"; 
    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";

    /*
     * Metode untuk melakukan referensi dari suatu objek private pada kelas
     */
    
    public Customer(int id, String name, String email, String password, Calendar joinDate)
    {
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        this.joinDate = joinDate;
    }

    /*
     * Metode untuk melakukan referensi dari suatu objek private pada kelas
     */
    
    public Customer(int id, String name, String email, String password, int year, int month, int dayOfMonth)
    {
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        this.joinDate = new GregorianCalendar(year, month, dayOfMonth);        
    }
    
     /*
     * Metode untuk melakukan referensi dari suatu objek private pada kelas
     */
    
    public Customer(int id, String name, String email, String password)
    {
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
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
        
    public Calendar getJoinDate()
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
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        
        if(matcher.matches() == true)
        {
            this.email = email;
        }
        
        else
        {
            this.email = "";
        }
    }

    /*
     * Metode untuk merubah password pelanggan
     * 
     * @return password dari pelanggan
     */
        
    public void setPassword(String password)
    {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(password);
        
        if(matcher.matches() == true)
        {
            this.password = password;
        }
        
        else
        {
            this.password = "";
        }
    }

    /*
     * Metode untuk merubah waktu membuat akun
     * 
     * @return joinDate dari pelanggan
     */
        
    public void setJoinDate(Calendar joinDate)
    {
        this.joinDate = joinDate;
    }

    public void setJoinDate(int year, int month, int dayOfMonth)
    {
        this.joinDate = new GregorianCalendar(year, month, dayOfMonth);
    }
    
    /*
     * Metode untuk menampilkan data
     * 
     * @return name dari pelanggan
     */
        
    public String toString()
    {
        SimpleDateFormat format = new SimpleDateFormat("dd MMMM yyyy");
        Date date = new Date();
        if(joinDate != null)
        {
            return "Id = " + id + 
                   "\nNama = " + name + 
                   "\nEmail = " + email + 
                   "\nPassword = " + password + 
                   "\nJoin Date : " + format.format(getJoinDate().getTime());
        }
        
        else
        {
            return "Id = " + id + 
                   "\nNama = " + name + 
                   "\nEmail = " + email + 
                   "\nPassword = " + password + 
                   "\nJoin Date : " + joinDate +
                   "\nJoin Date : " + format.format(date);
        }
    }
}
