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
import java.sql.*;

public class PatientDatabase 
{

    /**
     * @param args the command line arguments
     */
    
   
    
    public static void main(String[] args) 
    {
        Connection conn = null;
        Statement stmt = null;
        try
        {
            String host = "jdbc:derby://localhost:1527/contact";
            String uName = "nbuser";
            String uPass = "nbuser";
            
          
           
            
            conn = DriverManager.getConnection( host, uName, uPass );
            System.out.println("Successfully Connected to the database");
            
            stmt = conn.createStatement();
            
            String SQL = "CREATE TABLE PATIENT " +
                         "(ID INTEGER not NULL, " +
                         "First_Name VARCHAR(30), " +
                         "Last_Name VARCHAR(30), " +
                         "Age Integer, " +
                         "PRIMARY KEY (ID))";
            
            String INSERT_PATIENT = ("INSERT INTO PATIENT " + "VALUES(1, 'Ethan', 'DeRoy', 19)");
            
            
            stmt.executeUpdate(INSERT_PATIENT);
            
            
            
            
           
        }
        
        catch(SQLException err)
        {
            System.out.println(err.getMessage());
        }
        
        
    }
    
 
    
}
 