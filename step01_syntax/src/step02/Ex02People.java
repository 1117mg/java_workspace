package step02;


class People2 {
	// 인스턴스 변수(멤버 변수, 필드)
	String name = "Java";
	int age = 28;
	
	// 기본 생성자
	People2(){
		System.out.println("기본생성자");
	}
	
	// 사용자 정의 생성자 : 매개변수 사용
	// 오버로딩 overloading
	People2(String name){
		this.name = name;
	}
	People2(int age){
		this.age = age;
	}
	
	
	People2(String name, int age){
		this.name = name;
		if (age>=0) {
			this.age=age;
		}
	}
	
	// 메소드
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	void printInfo() {
		System.out.println(name + " " + age);
	}
	
	// 나이값에 음수가 지정X 메소드 만들기
	void setAge(int age) {
		if (age>=0) {
			this.age = age;
		} else {
			System.out.println("음수값은 나이로 지정될 수 없음");
		}
	}
	
}


public class Ex02People {
	public static void main(String[] args) {

		People2 mose = new People2("mose",25);
		People2 kiyoung = new People2("kiyoung", 26);

		
		
//		1.모세님
//		System.out.println(mose);
//		System.out.println(kiyoung);
		
//		//3.객체의 정보 보호?
//		People2 doil = new People2("doil", -27);
//		System.out.println(doil.age);
		
//		//2)메소드
//		doil.setAge(22);
//		System.out.println(doil.getAge());
		
		//추가 )
		// 1.생성자
		People2 santa = new People2();
		// 기본 생성자만 사용하는 경우 : 생략되어도 프로그램 내부에서 자동으로 생성
		// 사용자 정의 생성자를 사용하는 경우 : 기본생성자는 직접 선언 사용
		
	}

	
	
	
	
	
	
	
	
	
}
