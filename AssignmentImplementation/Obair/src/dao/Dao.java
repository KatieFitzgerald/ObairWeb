package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {

    protected Connection getConnection(){

        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://obair.cekdryqzjoi3.us-west-2.rds.amazonaws.com:3306/obair";
        String username = "katie";
        String password = "katie1996";
        Connection con = null;
        
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection successful");
        } catch (ClassNotFoundException ex1) {
        	ex1.printStackTrace();
            System.out.println("Failed to find driver class " + ex1.getMessage());
            System.exit(1);
        } catch (SQLException ex2) {
            System.out.println("Connection failed " + ex2.getMessage());
            System.exit(2);
        }
        return con;
    }

    protected void freeConnection(Connection con){
        try {
            if (con != null) {
                con.close();
                con = null;
            }
        } catch (SQLException e) {
            System.out.println("Failed to free connection: " + e.getMessage());
            System.exit(1);
        }
    }

    
}