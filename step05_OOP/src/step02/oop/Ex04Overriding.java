package step02.oop;

class Person {
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}

class Person2 {
	String name;
	int age;
	
	Person2(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	
	// equals() 재정의
	@Override
	public boolean equals(Object obj) {
		// Person 이름, 나이
		// 1. 형변환
		if(obj instanceof Person) {
			Person p = (Person)obj;
			// 2. 조건: 이름, 나이 같더라면
			if(this.name == (p.name) && this.age == p.age) {
				return true;
			}
		}
		return false;		
	}
}

public class Ex04Overriding {

	public static void main(String[] args) {
		Person p = new Person("java", 28);
		Person p1 = new Person("java", 28);
		Person2 p2 = new Person2("java", 28);
		
		// p - p1
		// 같은타입 && 같은값(이름, 나이) -> 같은객체로 인식 ?!
		System.out.println(p.equals(p1)); //false
		// p - p2
		System.out.println(p.equals(p2)); //false
		
		
		
		
		
		
		
		
		
	}

}