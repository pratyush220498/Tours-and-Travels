package Connection;
import java.sql.*;

/**
 *
 * @author pratyush
 */
public class MyConnection {
        static Connection con = null;
        static
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Driver load!!!!");
            }
            catch(Exception e)
            {System.out.println(e);}
        }
        public static Connection myConnection()
        {
            try
            {
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
                System.out.println("Database connected!!!");
            }
            catch(Exception e)
            {System.out.println(e);}
            return con;
        }
}
