package dept.service;

import java.sql.SQLException;
import java.util.ArrayList;

import dept.dao.DeptDAO;
import dept.dto.Dept;

public class DeptService {
	
	// 모든 부서 출력
	public static ArrayList<Dept> getAllDept() throws ClassNotFoundException, SQLException {
		
		ArrayList<Dept> deptList = null;
		deptList = DeptDAO.getAllDept();
		
		return deptList;
	}
	
	// 특정 부서 출력
	public static Dept getDeptByDeptno(int deptno) throws ClassNotFoundException, SQLException {
		
		Dept dept = null;
		dept = DeptDAO.getDeptByDeptno(deptno);
		
		return dept;
	}

	// 특정 부서 생성
	public static boolean insertDept(Dept newDept) throws ClassNotFoundException, SQLException {
		
		boolean result = false;
		result = DeptDAO.insertDept(newDept);
		
		return result;
	}
	
	// 특정 부서 수정
	public static boolean updateDeptLocByDeptno(int deptno, String newDeptLoc) throws ClassNotFoundException, SQLException {
		
		boolean result = false;
		result = DeptDAO.updateDeptLocByDeptno(deptno, newDeptLoc);
		
		return result;
	}
	
	
	// 특정 부서 삭제
	public static boolean deleteDeptLocByDeptno(int deptno, String newDeptLoc) throws ClassNotFoundException, SQLException {
		
		boolean result = false;
		result = DeptDAO.deleteDeptLocByDeptno(deptno, newDeptLoc);
		
		return result;
	}	
}