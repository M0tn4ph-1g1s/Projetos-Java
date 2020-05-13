
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
public class Conexao {
	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost/tbusuario";
	public static final String USER = "root";
	public static final String PASS = "";
	
	public static Connection getConexao() {
		try {
			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER , PASS);
            return conn;
            
		}
	    catch(Exception e){
	    	System.out.println("erro");
	    }
		return null;
	}
}
