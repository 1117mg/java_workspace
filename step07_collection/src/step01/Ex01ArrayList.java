package step01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

import model.domain.Student;


public class Ex01ArrayList {

	public static void main(String[] args) {
		// ArrayList
		ArrayList al1 = new ArrayList();

		// add()
		al1.add("java");
		al1.add(3); // Integer 저장!
		al1.add(new Student("java", 1001, "Junior"));
		
		
		// Iterator
		Iterator<String> iter = al1.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();
		
//		System.out.println(al1);
		
		//get()
//		System.out.println(al1.get(1));
		
		//remove()
//		System.out.println(al1.remove(0));
//		System.out.println(al1); 
		
//		System.out.println();
		
		// 반복문!!!
//		for(int i = 0; i<al1.size(); i++) {
//			if(al1.get(i) instanceof Student) {
//				System.out.println((Student)al1.get(i)).getGrade());
//			}
//		}
//		
//		// 제네릭 Generic <T>
//		ArrayList<Student> al2 = new ArrayList<Student>();
//		al2.add(3);
//		
//		
		
		
		ArrayList<String> aList = new ArrayList<String>();
		LinkedList<String> lList = new LinkedList<String>();
		
		long start;
		long end;
		
		start = System.nanoTime();
		for(int i = 0; i < 30000; i++) {
			lList.add(0, String.valueOf(i)); // 
		}
		end = System.nanoTime();
    
		start = System.nanoTime();
		for(int i = 0; i < 30000; i++) {
			lList.get(i);
		}
		end = System.nanoTime();
    
		System.out.println(end - start);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
