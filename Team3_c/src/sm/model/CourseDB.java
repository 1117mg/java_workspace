package sm.model;

import java.util.ArrayList;

import sm.dto.Course;

public class CourseDB {
	public static CourseDB course = new CourseDB();
	public static ArrayList<Course> courses = new ArrayList<>();
	
	static {
		courses.add(new Course("프론트엔드","0001","김강사",3));
		courses.add(new Course("백엔드","0002","박강사",5));
		courses.add(new Course("풀스택","0003","이강사",2));
	}
	
	public CourseDB() {
//		courses.add(new Course("프론트엔드","0001","김강사",3));
//		courses.add(new Course("백엔드","0002","박강사",5));
//		courses.add(new Course("풀스택","0003","이강사",2));
	}
	
	public static CourseDB getCourse() {
		return course;
	}
	
	// 모든 프로젝트 반환_
	public static ArrayList<Course> getCourseList(){
		return courses;
	}
	
	public void insertCourse(Course newProject) {
		courses.add(newProject);
	}
	
	// 삭제_
	public void deleteCourse(Course project) {
		courses.remove(project);
	}
}