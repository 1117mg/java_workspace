package step02;

// 접근 제한자 (Access modifier)


import model.domain.People;

public class Ex05Access{
	public static void main(String[] args) {
		People java = new People("java", 28);
		
		
//		java.name = "Java";
		java.setName("Ace");
//		System.out.println(java.name);
	}
}
