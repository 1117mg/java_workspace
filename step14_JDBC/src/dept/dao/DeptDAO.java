package dept.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dept.dto.Dept;
import util.DBUtil;

public class DeptDAO {
	
	// 모든 부서 출력
	public static ArrayList<Dept> getAllDept() throws SQLException, ClassNotFoundException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		ArrayList<Dept> deptList = null;
		
		try {
			// 1단계 
//			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2단계
			conn = DBUtil.getConnection();
			// 3단계
			stmt = conn.createStatement();
			// 4단계
			rset = stmt.executeQuery("SELECT * FROM dept");
			
			// 5단계
			deptList = new ArrayList<Dept>();
			
			while(rset.next()) {
				deptList.add(new Dept(rset.getInt("deptno"),
									rset.getString("dname"),
									rset.getString("loc")));
			}			
		} finally {
			
			DBUtil.close(rset, stmt, conn);
		}
		
		
		return deptList;
	}
	
	
	// 특정 부서 출력
	public static Dept getDeptByDeptno(int deptno) throws ClassNotFoundException, SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		Dept dept = null;
		
		try {
			// 2단계
//			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/SCOTT?serverTimezone=Asia/Seoul", "SCOTT", "TIGER");
			conn = DBUtil.getConnection();
			// 3단계
			stmt = conn.createStatement();
			// 4단계
			rset = stmt.executeQuery("SELECT * FROM dept WHERE deptno = " + deptno);
			
			// 5단계			
			while(rset.next()) {
				dept = new Dept(rset.getInt("deptno"),
									rset.getString("dname"),
									rset.getString("loc"));
			}			
		} finally {
			DBUtil.close(rset, stmt, conn);
			
		}
		
		
		return dept;
	}

	// 특정 부서 생성 : INSERT INTO dept VALUES (deptno, dname, loc);
	public static boolean insertDept(Dept newDept) throws SQLException, ClassNotFoundException {
		Connection conn = null;
//		Statement stmt = null;
		PreparedStatement pstmt = null;
		
		try {
			// 2단계
			conn = DBUtil.getConnection();
			// 3단계
//			stmt = conn.createStatement();
			pstmt = conn.prepareStatement("INSERT INTO dept VALUES (?, ?, ?)");
			// 4단계
//			int result = stmt.executeUpdate("INSERT INTO dept VALUES (" + newDept.getDeptno() + " , "
//																		+ newDept.getDname() + " , "
//																		+ newDept.getLoc() + ")");
			
			pstmt.setInt(1, newDept.getDeptno());
			pstmt.setString(2, newDept.getDname());
			pstmt.setNString(3, newDept.getLoc());
			
			int result = pstmt.executeUpdate();
			
			// 5단계			
			if(result != 0) {
				return true;
			}
			
			// 6단계
		} finally {
//			pstmt.close();
//			conn.close();
			
			DBUtil.close(pstmt, conn);
		}
		
		
		return false;
	}
	
	// 위치 수정 : UPDATE dept SET loc = newDeptLoc WHERE deptno = deptno;
	public static boolean updateDeptLocByDeptno(int deptno, String newDeptLoc) throws SQLException, ClassNotFoundException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement("INSERT INTO dept VALUES (?, ?, ?)");
				
			pstmt.setString(1, newDeptLoc);
			pstmt.setInt(2, deptno);
			
			int result = pstmt.executeUpdate();
			
			
			// 5단계			
			if(result != 0) {
				return true;
			}
			
			// 6단계
		} finally {
			DBUtil.close(pstmt, conn);
		}
		
		
		return false;
		
		
	// 특정 부서 삭제 : DELETE FROM dept WHERE deptno = ?
	public static boolean deleteDeptLocByDeptno(int deptno, String newDeptLoc) throws SQLException, ClassNotFoundException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement("INSERT INTO dept VALUES (?, ?, ?)");
				
			pstmt.setString(1, newDeptLoc);
			pstmt.setInt(2, deptno);
			
			int result = pstmt.executeUpdate();
			
			
			// 5단계			
			if(result != 0) {
				return true;
			}
			
			// 6단계
		} finally {
			DBUtil.close(pstmt, conn);
		}
		
		
		return false;
	
	}

	
	
	
	
	
}