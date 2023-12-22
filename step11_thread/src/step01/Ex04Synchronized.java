package step01;

// 
class NumberChange {
	int num;
	
	public void setNum(int num) {
		synchronized(this) {
			if(this.num != 7) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				this.num = num;
				System.out.println(num);
			}else {
				System.out.println("num 값을 변경할 수 없습니다.");
			}
		}
	}
}

public class Ex04Synchronized {
	public static void main(String[] args) {
		NumberChange nc = new NumberChange();
		
		// 스레드 1 
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				nc.setNum(7);
			}
		});

		// 스레드 2 
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				nc.setNum(10);
			}
		});
		
		
		thread1.start();
		thread2.start();
		
		//
		
		// t1(7) -> t2 x
		
		// t2(10) -> t2(7) o
		
		
		
		
		
		
		
		
		
		
	}
}