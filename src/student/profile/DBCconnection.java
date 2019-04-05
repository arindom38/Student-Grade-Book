/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.profile;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Aro
 */
public class DBCconnection {
    private Connection DBConnection;
    public Connection connect(){
        try {
            
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("COnnection database");
        }
        catch (ClassNotFoundException cnfe){
            System.out.println("Connection Failed"+cnfe);
        }
        String url = "jdbc:derby://localhost:1527/student";
        try {
            DBConnection = DriverManager.getConnection(url,"root","root1234");
            System.out.println("Databasse connected");
        } 
        catch (SQLException se){
            System.out.println("No Database"+ se);
        }
        return DBConnection;
    }
}
