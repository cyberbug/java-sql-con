# java-sql-con
java file for connecting to mysql using jdbc. Just change the package name in the file and 
create the class variable wherever you want to use the connection

Demo

package your_package_name

import java.sql.*;


public class Testdb{
   public static void main(String[] args){
   
   Connection con = Mysql_connection.getConnection();
   
   /*
   Execute rest of your commands here
   */
   }
}   
