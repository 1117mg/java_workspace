package news.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import news.dto.News;


public class NewsDAO {
	public static boolean insertDept(News news) throws ClassNotFoundException, SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		
		try {
			// 1�ܰ� 
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2�ܰ�
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/SCOTT?serverTimezone=Asia/Seoul", "SCOTT", "TIGER");
			// 3�ܰ� 
			pstmt = conn.prepareStatement("INSERT INTO news VALUES (?, ?)");
			
			
			// 4�ܰ�
			pstmt.setString(1, news.getTitle());
			pstmt.setString(2, news.getUrl());
			
			int result = pstmt.executeUpdate();
			
			// 5�ܰ�
			if(result != 0) {
				return true;
			}
			
			// 6�ܰ�
		} finally {
			pstmt.close();
			conn.close();
		}
		
		return false;
	}
}
