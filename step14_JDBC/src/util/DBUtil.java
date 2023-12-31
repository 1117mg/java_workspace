package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBUtil {
	
	static Properties properties = new Properties();
	
	static {
		// 1단계 
		try {
			properties.load(new FileInputStream("db.properties"));			
			Class.forName(properties.getProperty("jdbc.driver"));
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	// 2단계
	public static Connection getConnection() throws SQLException {
//		return DriverManager.getConnection("jdbc:mysql://localhost:3306/SCOTT?serverTimezone=Asia/Seoul", "SCOTT", "TIGER");
		return DriverManager.getConnection(properties.getProperty("jdbc.url"),
											properties.getProperty("jdbc.id"),
											properties.getProperty("jdbc.pw"));
	}
	

	// 6단계
	public static void close(ResultSet rset, Statement stmt, Connection conn) throws SQLException {
		if(rset != null) {
			rset.close();
		}
		if(stmt != null) {
			stmt.close();
		}
		if(conn != null) {
			conn.close();
		}
		
	}


	public static void close(Statement pstmt, Connection conn) throws SQLException {
		if(pstmt != null) {
			pstmt.close();
		}
		if(conn != null) {
			conn.close();
		}
	}
}
