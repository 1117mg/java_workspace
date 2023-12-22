package step01;

public class Ex03ControlFlow {

	public static void main(String[] args) {
		// 조건문
		// 1. if문
		// 관리자의 id(String)가 admin 일때 -> "접속성공"
		String id="admin";
		if (id=="admin") {
			System.out.println("접속성공");
		}else {
			System.out.println("접속실패");
		}
		
		// 2. switch/case
		// 1-> 고객상담, 2-> 가게연결, 3-> 다시듣기, 4-> 종료
		int num =3;
		switch (num) {
			case 1:
				System.out.println("고객상담");
				break;
			case 2:
				System.out.println("가게연결");
				break;
			case 3:
				System.out.println("다시듣기");
				break;
			case 4:
				System.out.println("종료");
				break;
			default:
				System.out.println("오류");
				break;
		}
		
		// 반복문
		// 1. for
		// 1 ~ 5 출력
//		for(int i=1; i<=5; i++) {
//			if(i%2)
//		}

		
		// 참고 : continue
		
		for(int i=1; i<=10; i++) {
			if(i%3 == 0)
			break;
			System.out.println(i);
		}
		
		
		
		
		
		
		
	}

}
