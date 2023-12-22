package step01;

class Thread1 extends Thread{
	
	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println((i+1) + "번 실행");
		}
	}
}

class Thread2 extends Thread{
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println((i+1) + "번 실행");
		}
	}
}


public class Ex01Thread {
	public static void main(String[] args) {
		Runnable thread1 = new Thread1();
		Runnable thread2 = new Thread2();
		
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		
		t1.start();

		t2.start();
		
	}
}
