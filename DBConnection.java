import java.sql.*;

public class DBConnection
{
    public static Connection getConnection() throws Exception
    {
        String url = "jdbc:postgresql://localhost:5432/vehicle_db";
        String user = "postgres";
        String password = "246584";

        return DriverManager.getConnection(url, user, password);
    }
}
