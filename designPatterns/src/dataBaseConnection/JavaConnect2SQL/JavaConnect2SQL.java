package dataBaseConnection.JavaConnect2SQL;
import java.sql.*;

public class JavaConnect2SQL {
    private static JavaConnect2SQL instance = null;
    private Connection connection = null;

    private JavaConnect2SQL() {
        String connectionString = "jdbc:sqlserver://ITLNB079B:1433;user=sa;password=sa;encrypt=true;trustServerCertificate=true;";
        try {
            connection = DriverManager.getConnection(connectionString);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static synchronized JavaConnect2SQL getInstance() {
        if (instance == null) {
            instance = new JavaConnect2SQL();
        }
        return instance;
    }

    public synchronized Connection getConnection() {
        return connection;
    }

    public synchronized void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
