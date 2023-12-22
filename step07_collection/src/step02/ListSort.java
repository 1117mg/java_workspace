package step02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import model.domain.Student;

class StudentNoComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getStudentNo() > o2.getStudentNo()) {
		return 1;
	} else if (o1.getStudentNo() < o2.getStudentNo()) {
		return -1;
	}
		return 0;
	}
}


public class ListSort {
	public static void main(String[] args) {
		// sort
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		// 34, 25, 45, 11, 8
		integerList.add(34);
		integerList.add(25);
		integerList.add(45);
		integerList.add(11);
		integerList.add(8);
		
		integerList.forEach((i) -> {
			System.out.println(i);
		});
		
//		System.out.println(integerList);
		
		// Collections
		// 오름차순(기본)
//		Collections.sort(integerList);
//		System.out.println(integerList);
		
		// 내림차순
//		Collections.sort(integerList, Collections.reverseOrder());
//		System.out.println(integerList);
		
		
		// list.sort()
		integerList.sort(Comparator.reverseOrder());
//		System.out.println(integerList);
		
		
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("banana");
		stringList.add("pineapple");
		stringList.add("apple");
		
//		stringList.sort(Comparator.reverseOrder());
//		System.out.println(stringList);
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Spring", 1004, "Junior"));
		studentList.add(new Student("Java", 1001, "Junior"));
		studentList.add(new Student("DB", 1002, "Junior"));
		
		System.out.println(studentList);
		
		// 
		Collections.sort(studentList, new StudentNoComparator());
		System.out.println(studentList);
		
	}
}
