package JDBC;

import java.sql.*;

public class preparedstatement {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/db";
        String username = "user";
        String password = "password";

        try(Connection connection = DriverManager.getConnection(url,username,password)){

            String query = "SELECT * FROM EMP WHERE EMPNO = ?";

            try(PreparedStatement preparedstatement = connection.prepareStatement(query)){

                preparedstatement.setString(1,"7521");

                try(ResultSet resultSet = preparedstatement.executeQuery()){

                    while (resultSet.next()) {
                        int id = resultSet.getInt("empno");
                        String name = resultSet.getString("ename");

                        System.out.println("ID : "+id + ", Name :"+name);
                    }
                }
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
