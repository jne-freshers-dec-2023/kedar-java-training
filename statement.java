package JDBC;

import java.sql.*;

public class statement {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/db";
        String user = "user";
        String password = "password";

        try(Connection connection = DriverManager.getConnection(url,user,password)){

            try(Statement statement = connection.createStatement()){

                String query = "SELECT * FROM EMP";
                try(ResultSet resultSet = statement.executeQuery(query)){

                    while (resultSet.next()){

                        int id = resultSet.getInt("empno");
                        String name = resultSet.getString("ename");

                        System.out.println("ID : " + id + ", Name : "+name);
                    }
                }
            }
        }
        catch (SQLException e){
            System.err.println("Error in Database Connection : "+e.getMessage());
        }
    }
}
