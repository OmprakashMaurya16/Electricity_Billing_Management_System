
import java.sql.*;

public class conn {

    Connection c;
    Statement s;

    conn() {

        try {
            
            System.out.println("Connecting to database...");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs", "root", "Maurya@2005");
            System.out.println("Connection successful!");  
            s = c.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
