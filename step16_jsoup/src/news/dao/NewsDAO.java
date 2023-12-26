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
			// 1단계 
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2단계
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/SCOTT?serverTimezone=Asia/Seoul", "SCOTT", "TIGER");
			// 3단계 
			pstmt = conn.prepareStatement("INSERT INTO news VALUES (?, ?)");
			
			
			// 4단계
			pstmt.setString(1, news.getTitle());
			pstmt.setString(2, news.getUrl());
			
			int result = pstmt.executeUpdate();
			
			// 5단계
			if(result != 0) {
				return true;
			}
			
			// 6단계
		} finally {
			pstmt.close();
			conn.close();
		}
		
		return false;
	}
}
