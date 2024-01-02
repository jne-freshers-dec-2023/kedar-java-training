package jdbc;
import java.sql.*;

public class databaseconnection {

        public static final String url = "jdbc:mysql://localhost:3306/db";
        public static final String username = "user";
        public static final String password = "password";

        public static Connection getConnectionn() throws SQLException{
            return DriverManager.getConnection(url,username,password);
        }

        public static PreparedStatement getPreparedStatement(String query) throws SQLException {
            return getConnectionn().prepareStatement(query);
        }

        public static Statement getStatement() throws SQLException {
            return getConnectionn().createStatement();
        }

        public static ResultSet getResultSet(String query) throws SQLException {
            return getStatement().executeQuery(query);
        }
    }
