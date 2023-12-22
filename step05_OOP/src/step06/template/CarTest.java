package step06.template;

public class CarTest {

	public static void main(String[] args) {
		AICar aiCar = new AICar();
		aiCar.run();
		
		System.out.println();
		
		
		ManualCar manualCar = new ManualCar();
		manualCar.run();

	}

}
