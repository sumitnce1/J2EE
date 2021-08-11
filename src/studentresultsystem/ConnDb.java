package studentresultsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnDb {
    public static Connection conLink() throws ClassNotFoundException, SQLException{
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con;
        con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","srs","srs");
        return con;  
    }
}
