package model.domain;

import java.util.Comparator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Student implements Comparator<Student>{
	private String name;
	private int studentNo;
	private String grade;
	
	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getStudentNo()>o2.getStudentNo()) {
			return 1;
		} else if(o1.getStudentNo() < o2.getStudentNo()) {
			return -1;
		}
		
		return 0;
	}
	
//	@Override
//	public int compareTo(Student student) {
//		if(student.getStudentNo() < this.getStudentNo()) {
//			return 1; 
//		} else if (this.getStudentNo() < student.getStudentNo()) {
//			return -1;
//		}
//		return 0;
//	}
}