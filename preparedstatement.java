package jdbc;

import java.sql.*;

public class preparedstatement {



   public static final String query = "SELECT * FROM EMP WHERE EMPNO = ?";



    public static void main(String[] args) throws SQLException {
        addData();
    }

    public static void addData() throws SQLException {
         PreparedStatement preparedStatement = databaseconnection.getPreparedStatement(query);
         preparedStatement.setString(1,"7521");
                try(ResultSet resultSet = preparedStatement.executeQuery()){

                    while (resultSet.next()) {
                        int id = resultSet.getInt("empno");
                        String name = resultSet.getString("ename");

                        System.out.println("ID : "+id + ", Name :"+name);
                    }
                }
            }
    }
