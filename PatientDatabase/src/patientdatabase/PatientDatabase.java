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
    
    private static final String CREATE_TABLE_SQL = "CREATE TABLE employee ("
            + "EMP_ID int(11) NOT NULL,"
            + "NAME VARCHAR(45) NOT NULL,"
            + "DOB DATE NOT NULL,"
            + "EMAIL VARCHAR(45),"
            + "DEPT varchar(45) NOT NULL,"
            + "PRIMARY KEY (EMP_ID)";
    
    public static void main(String[] args) 
    {
        try
        {
            String host = "jdbc:derby://localhost:1527/contact";
            String uName = "nbuser";
            String uPass = "nbuser";
            
          
           
            
            Connection con = DriverManager.getConnection( host, uName, uPass );
            
            PreparedStatement stmt = con.prepareStatement(CREATE_TABLE_SQL);
           
        }
        
        catch(SQLException err)
        {
            System.out.println(err.getMessage());
        }
        
        
    }
    
 
    
}
