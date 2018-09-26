
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tholithemba
 */
public class Connect2database 
{
      public static Connection getConnection()
      {
          Connection connection = null;
          String connectionUrl = "jdbc:mysql://localhost/testDB?characterEncoding=UTF-8&useSSL=false";
          String dbUser = "root";
          String username = "Tholithemba";
          
          try{
              Class.forName("com.mysql.cj.jdbc.Driver");
              connection = DriverManager.getConnection(connectionUrl, dbUser, username);
          }catch(Exception e)
          {
              System.out.println(e.getMessage());
          }
          
          return connection;   
      }
}
