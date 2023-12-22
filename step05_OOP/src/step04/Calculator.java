package step04;

public class Calculator implements Calculate,Connect{

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	@Override
	public void connection();
	
}
