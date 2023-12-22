package step02.oop;

class Parent {
	String name;
	int age;
	
	public Parent() {
		System.out.println("부모 생성자");
	}
	
	public Parent(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
	}
}

class Child extends Parent {
	String wish;
	
	public Child() {
//		super(); // 부모의 생성자 호출
		System.out.println("자식 생성자");
	}
	
	// 사용자 정의 생성자
	public Child(String name, int age, String wish) {
//		this.name = name;
//		this.age = age;
		super(name, age);
		this.wish = wish;
	}
	
	public void printInfo2() {
		super.printInfo();
		System.out.println(wish);
	}
}

public class Ex01Child {
	// 동물
	// 코끼리, 사자, 토끼, 사슴, 거북이, .....
	public void checkParent(Parent obj) {
		// 체크
	}
	
	public void checkChild(Child obj) {
		// 체크
	}
	
	public void check(Parent allObj) {
		
	}
	
	public static void main(String[] args) {
		Child child = new Child();
		child.name = "java";
		child.age = 28;
		child.wish = "game";
		
//		child.printInfo();
		child.printInfo2();
		
		// printInfo2 호출 시 -> name, age 모두 출력 => super 호출 가능!
		// 추가)
		// 1. super() 생략 가능 O
		// 2. 부모의 사용자정의 생성자 활용
		Child child2 = new Child("oop", 25, "study");
		child2.printInfo2();
		// 3. 단일 상속*만 가능
		
		
		// 다형성 : 부모와 자식이 상속 관계에 있을 때, 자식은 부모의 타입으로 생성 가능
		Parent p1 = new Parent();
		Child c1 = new Child();
		
		Parent c2 = new Child();
		/*
		 * Child pc = new Child();
		 * Parent c2 = c2;
		 */
//		c2.printInfo2(); // 2는 사용을 x -> 부모에 속해있는 객체
		// 2를 사용하려면? -> 자식의 타입으로 다시 형변환
		
		Child c3 = (Child)c2;
		c3.printInfo2();
		
		// 부모객체는 자식 타입으로 생성 가능?
//		Child p2 = new Parent(); // 불가능!
		
		
		
		
		
		
		
		
		
		
		
	}
}
