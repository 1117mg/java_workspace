package step06.template;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void turnon();
	public abstract void turnoff();
	
	// 템플릿 패턴
	public void run() {
		turnOn();
		drive();
		stop();
		turnOff();
	}
	
}
