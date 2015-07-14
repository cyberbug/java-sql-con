/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package your_package_name;

/**
 *
 * @author cyber
 */
import java.sql.*;

public class Mysql_connection {
  static  Connection con=null;
public static Connection getConnection()
{
        try{
    Class.forName("com.mysql.jdbc.Driver");
    
    /* creating a connection variable
    replace username with your mysql username
    replace password with your mysql password
    */
    
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","username","password");
    
   
    }
    catch(Exception e)
    {e.printStackTrace();}
    
    /*returning connection variable*/
        return con;
}    
}
