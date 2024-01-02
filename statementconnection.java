package jdbc;

import java.sql.*;

public class statementconnection {
    public static void main(String[] args) throws SQLException {

        add();
    }

    public static void add() throws SQLException {
            Statement statement = databaseconnection.getStatement();

                String query = "SELECT * FROM EMP";
                try(ResultSet resultSet = statement.executeQuery(query)){

                    while (resultSet.next()){

                        int id = resultSet.getInt("empno");
                        String name = resultSet.getString("ename");

                        System.out.println("ID : " + id + ", Name : "+name);
                    }
                } catch (SQLException e){
                    System.err.println("Error in Database Connection : "+e.getMessage());
                }
            }


}
