package AnandaRizkyDutoPamungkas.JFood;

import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import static AnandaRizkyDutoPamungkas.JFood.DatabaseConnection.connection;

/**
 * Method for arranging database in postgreSQL
 *
 * @author Ananda Rizky Duto Pamungkas
 * @version 6 June 2020
 */

public class DatabaseCustomerPostgres {
    /**
     * Method for get all Customer from PostgreSQL
     * @return object customer if success
     */
    public static ArrayList<Customer> getCustomerDatabase(){
        Connection c = connection();
        PreparedStatement stmt;
        ArrayList<Customer> customerDatabase = new ArrayList<>();
        Customer customer = null;
        int id = 0;
        String name = null;
        String email = null;
        String password = null;
        String date;
        Calendar cal = null;
        try {
            String sql = "SELECT * FROM customer;";
            stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                id = rs.getInt("id");
                name = rs.getString("name");
                email  = rs.getString("email");
                password = rs.getString("password");
                date = rs.getString("joindate");
                DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
                cal = Calendar.getInstance();
                cal.setTime(df.parse(date));
                customerDatabase.add(new Customer(id, name, email, password, cal));
            }
            rs.close();
            stmt.close();
            c.close();
            return customerDatabase;
        } catch (SQLException | ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Method for inserting customer to database
     * @param customer object customer to be input
     * @return object customer if success
     */
    public static Customer addCustomer(Customer customer) {
        Connection c = connection();
        PreparedStatement stmt;
        try {
            c.setAutoCommit(false);
            String name = customer.getName();
            String email = customer.getEmail();
            String password = customer.getPassword();
            String sql = "INSERT INTO customer (name, email, password) VALUES ('"+name+"','"+email+"','"+password+"');";
            stmt = c.prepareStatement(sql);
            stmt.executeUpdate();
            stmt.close();
            c.commit();
            c.close();
            return customer;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Method for get Last Customer Id (not used)
     * @return last id of customer in database
     */
    public static int getLastId(){
        Connection c = connection();
        PreparedStatement stmt;
        int id = 0;
        try {
            String sql = "SELECT id from customer;";
            stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                id = rs.getInt(1);
            }
            stmt.close();
            c.close();
            return id;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }

    /**
     * Method for get Customer from PostgreSQL using customer id
     * @param id_custumer id for customer
     * @return object customer if success
     */
    public static Customer getCustomerById(int id_custumer){
        Connection c = connection();
        PreparedStatement stmt;
        Customer customer = null;
        int id = 0;
        String name = null;
        String email = null;
        String password = null;
        String date;
        Calendar cal = null;
        try {
            String sql = "SELECT * FROM customer WHERE id = '"+id_custumer+"';";
            stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                id = rs.getInt("id");
                name = rs.getString("name");
                email  = rs.getString("email");
                password = rs.getString("password");
                date = rs.getString("joindate");
                DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
                cal = Calendar.getInstance();
                cal.setTime(df.parse(date));
            }
            rs.close();
            stmt.close();
            c.close();
            customer = new Customer(id, name, email, password, cal);
            return customer;
        } catch (SQLException | ParseException e) {
            e.printStackTrace();
            return null;
        }
    }


    /**
     * Method for remove customer using customer id
     * @param id id of customer
     */
    public static boolean removeCustomer(int id){
        Connection c = connection();
        PreparedStatement stmt;
        try {
            String sql = "DELETE FROM customer WHERE id = "+id+";";
            stmt = c.prepareStatement(sql);
            stmt.execute();
            stmt.close();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * Method for login customer using customer email and password
     * @param emailParam id of customer
     * @param passwordParam password of customer
     * @return object customer if success
     */
    public static Customer customerLogin(String emailParam, String passwordParam)
    {
        Connection c = connection();
        PreparedStatement stmt;
        Customer customer = null;
        int id = 0;
        String name = null;
        String email = null;
        String password = null;
        String date;
        Calendar cal = null;
        try {
            c.setAutoCommit(false);
            String sql = "SELECT * FROM customer WHERE email = '"+emailParam+"' AND password = '"+passwordParam+"';";
            stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while ( rs.next() ) {
                id = rs.getInt("id");
                name = rs.getString("name");
                email  = rs.getString("email");
                password = rs.getString("password");
                date = rs.getString("joindate");
                DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
                cal = Calendar.getInstance();
                cal.setTime(df.parse(date));
            }
            rs.close();
            stmt.close();
            c.close();
            //Check if response is null
            if (id == 0){
                return null;
            }
            else{
                customer = new Customer(id, name, email, password, cal);
                return customer;
            }
        } catch ( Exception e ) {
            e.printStackTrace();
            return null;
        }
    }
}