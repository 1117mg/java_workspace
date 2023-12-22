package step02;

class Customer {
	// 인스턴스 변수
	String name;
	static String company;
	//static 초기화 블럭{ }
	static {
		company = "it";
		
//		name= "java"; // 에러 : static 키워드x
	}
	
	// 상수 : static final
	static final double PI = 3.14;
	
	
	// 생성자
	Customer(){
	}
	
	// 메소드
	String getName() {
		return name;
	}
	static String getCompany() {
		return company;
	}
}

public class Ex04Static {
	public static void main(String[] args) {
		Customer customer1 = new Customer();
		System.out.println(customer1.name);
		System.out.println(Customer.getCompany());
		
		System.out.println(Customer.PI);

	}

}



