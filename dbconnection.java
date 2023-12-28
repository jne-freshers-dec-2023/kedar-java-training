package JDBC;//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class JDBC.dbconnection {
//    public static void main(String[] args) {
//        // Database connection information
//        String url = "jdbc:mysql://localhost:3306/db";
//        String user = "user";
//        String password = "password";
//
//        try (Connection connection = DriverManager.getConnection(url, user, password)) {
//            // Create a Statement
//            try (Statement statement = connection.createStatement()) {
//                // Execute a SELECT query
//                String query = "SELECT * FROM EMP";
//                try (ResultSet resultSet = statement.executeQuery(query)) {
//                    // Process the ResultSet (retrieve and print data)
//                    while (resultSet.next()) {
//                        int id = resultSet.getInt("empno");
//                        String name = resultSet.getString("ename");
//                        // Process other columns as needed
//                        System.out.println("ID: " + id + ", Name: " + name);
//                    }
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbconnection {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/db";
        String username = "user";
        String password = "password";

        try(Connection connection = DriverManager.getConnection(url,username,password)){
            System.out.println("Connection to the Database Successful");
        }
        catch (SQLException e){
            System.err.println("Error in DataBase Connection : "+e.getMessage());
        }
    }
}