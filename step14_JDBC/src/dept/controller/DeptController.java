/*
- 모든 부서 정보 검색 : getAllDept()
- 부서번호로 특정 부서 검색 : getDeptByDeptno(int deptno)
- 새로운 부서 생성 : insertDept(new Dept(deptno, dname, loc))
- 부서번호로 검색한 특정 부서의 위치 수정 : updateDeptLocByDeptno(int deptno, String newDeptLoc)
- 부서번호로 검색한 특정 부서를 삭제 : deleteDeptByDeptno(int deptno) 
 */

package dept.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import dept.dto.Dept;
import dept.service.DeptService;

public class DeptController {
	
	// 모든 부서 출력
//	public static ArrayList<Dept> getAllDept() {
//		
//		ArrayList<Dept> deptList = null;
//		try {
//			deptList = DeptService.getAllDept();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//		return deptList;
//	}
	
	// 특정 부서 출력
//	public static Dept getDeptByDeptno(int deptno) {
//		Dept dept = null;
//		try {
//			dept = DeptService.getDeptByDeptno(deptno);
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		return dept;
//	}
	
	
	// 특정 부서 생성
//	public static boolean insertDept(Dept newDept){
//		
//		boolean result = false;
//		try {
//			result = DeptService.insertDept(newDept);
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		return result;
//	}

	// 특정 위치 수정
	public static boolean updateDeptLocByDeptno(int deptno, String newDeptLoc) {
		
		boolean result = false;
		try {
			result = DeptService.updateDeptLocByDeptno(deptno, newDeptLoc);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}
	
	// 특정 부서 삭제
	public static boolean deleteDeptByDeptno(int deptno) {
		
		boolean result = false;
		try {
			result = DeptService.deleteDeptLocDeptno(deptno, newDeptLoc);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}