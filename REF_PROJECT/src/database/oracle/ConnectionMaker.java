package database.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMaker {
	
	private static Connection conn = null;
	
	private ConnectionMaker() {}
	
	public static void init() throws ClassNotFoundException, SQLException {
		if ( null == conn ) {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/orcl", 
					"scott", 
					"tiger"
					);
			conn.setAutoCommit(false);
		}
	}
	
	public static Connection getConnection() {
		return conn;
	}
	

}
