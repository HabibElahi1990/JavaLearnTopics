package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
    public static Connection connection;
    public static Statement statement;

    public static void open(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
            statement=connection.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(){
        try {
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
