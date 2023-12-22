package dept.view;

import java.sql.SQLException;

import dept.controller.DeptController;
import dept.dto.Dept;

public class DeptView {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		// 모든 부서 출력
//		System.out.println(DeptController.getAllDept());
		
		// 특정 부서 검색
//		System.out.println(DeptController.getDeptByDeptno(10));
		
		// 특정 부서 생성
//		Dept newDept = new Dept(50, "IT", "SEOUL");
//		boolean insertResult = DeptController.insertDept(newDept);
//		if(insertResult) {
//			System.out.println("부서 생성 완료");
//		} else {
//			System.out.println("부서 생성 실패");
//		}
		
		// 특정 부서 수정
//		boolean updateResult = DeptController.updateDeptLocByDeptno(50, "BUSAN");
//		if(updateResult) {
//			System.out.println("부서 수정 완료");
//		} else {
//			System.out.println("부서 수정 실패");
//		}
		
		// 특정 부서 삭제
		boolean deleteResult = DeptController.updateDeptLocByDeptno(50, "BUSAN");
		if(deleteResult) {
			System.out.println("부서 삭제 완료");
		} else {
			System.out.println("부서 삭제 실패");
		}
		
	}

}
