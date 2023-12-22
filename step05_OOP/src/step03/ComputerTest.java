package step03;

public abstract class ComputerTest {

	public static void main(String[] args) {
//		Computer computer = new Computer(); // 객체로 생성 불가능
		
		Computer deskTop = new DeskTop();
		deskTop.display();
		
		Computer lapTop = new LapTop();
		lapTop.display();
	}

}
