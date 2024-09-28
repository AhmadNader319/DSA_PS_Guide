package Utils;


//importing sql.Connection providing the information for the tables and SQL Query and procedures ready to execute.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtils {

    private static final String URL = "jdbc:postgresql://localhost:5432/dbname";
    private static final String USER = "postgres";
    private static final String PASSWORD = "notpostgres";

    public static Connection getConnection(){
        Connection connection = null;
        try {
            // Load the PostgresSQL driver (optional in newer versions)
            Class.forName("org.postgresql.Driver");
            // Get the connection
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();  // Class for the driver not found
        } catch (SQLException e) {
            e.printStackTrace();  // SQLException during connection
        }
        return connection;

    }
    public static void closeConnection(Connection conn){
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
