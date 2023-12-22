package step02;

// 설계 People

class People {
	// 인스턴스 변수(멤버 변수, 필드)
	String name = "Java";
	int age = 28;
	
	// 기본생성자
//	People(){}	
	
	
	// 메소드
	// 이름 반환 메소드
	String getName() {
		return name;
	}
	
	// 나이 반환 메소드(getAge)
	int getAge() {
		return age;
	}
	
	// 일반 정보(name, age) 출력 메소드(printInfo)
	void printInfo() {
		System.out.println(name + " " + age);
//		return name + " " + age;
	}
}

public class Ex01People{
	public static void main(String[] args) {
		
		People ppll = new People();
		System.out.println(ppll);
		System.out.println(ppll.name);
		System.out.println(ppll.age);
		System.out.println(ppll.getAge());
		
		ppll.printInfo();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}