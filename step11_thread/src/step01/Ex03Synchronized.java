package step01;

// 
class ATM implements Runnable {
	private int deposit = 10000;
	
	@Override
	public void run() {
		
		synchronized (this) {
			for(int i=0;i<5;i++) {
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				withdraw(1000);
			}
			
		}
		
		
		for(int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
					e.printStackTrace();
			}
			withdraw(1000);
		}
	}
	
	// 
	public void withdraw(int money) {
		if(deposit > 0) {
			deposit -= money;
			System.out.println(Thread.currentThread().getName() + " 님이 출금했습니다.");
			System.out.println("현재 잔액은 " + deposit + " 입니다.");
		}else {
			System.out.println(Thread.currentThread().getName() + " 잔액이 부족합니다.");
		}
	}
}


public class Ex03Synchronized {
	public static void main(String[] args) {
		//
		ATM atm = new ATM();
		
		Thread suhan = new Thread(atm,"suhan");
		Thread sanghun = new Thread(atm,"sanghun");
		
		
		suhan.start();
		sanghun.start();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}