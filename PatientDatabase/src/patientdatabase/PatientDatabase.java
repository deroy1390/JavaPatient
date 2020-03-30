package patientdatabase;

/**
 *
 * @author Ethan DeRoy
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class PatientDatabase 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        try
        {
            String host = "jdbc:derby://localhost:1527/contact";
            String uName = "nbuser";
            String uPass = "nbuser";
            
            Connection con = DriverManager.getConnection( host, uName, uPass );
        }
        
        catch(SQLException err)
        {
            System.out.println(err.getMessage());
        }
        
        
    }
    
}
