package dataBaseConnection.JavaConnect2SQL;

import java.sql.*;

public class connectionTest {
    public static void main(String[] args) {
        JavaConnect2SQL connectionSingleton = JavaConnect2SQL.getInstance();
        Connection connection = connectionSingleton.getConnection();

        connectionSingleton.closeConnection();
    }
}
