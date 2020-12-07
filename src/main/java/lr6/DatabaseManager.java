package lr6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    private DatabaseManager() { };
    private static DatabaseManager instance;

    public static DatabaseManager getInstance() {
        if (instance == null) {
            instance = new DatabaseManager();
        }
        return instance;
    }

    static final String DB_URL = System.getenv("LR6_DB_URL");
    static final String USER = System.getenv("LR6_DB_USER");
    static final String PASSWORD = System.getenv("LR6_DB_PASSWORD");

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            System.out.println("Connected to the PostgreSQL server successfully");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return conn;
    }
}
