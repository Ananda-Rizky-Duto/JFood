package AnandaRizkyDutoPamungkas.JFood;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Kelas ini digunakan untuk menghubungkan database dengan postgre
 *
 * @author Ananda Rizky Duto Pamungkas
 * @version 6 Juni 2020
 */

public class DatabaseConnection {
    protected static Connection connection() {
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jfood", "postgres", "");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return c;
    }
}
