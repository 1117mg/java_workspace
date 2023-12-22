package step01;

class RunnableThread implements Runnable{
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName() + " - " + (i+1) + "번 실행");
		}
	}
}

public class Ex02Thread {

	public static void main(String[] args) {
		
		RunnableThread runThread1 = new RunnableThread();
		Thread t1 = new Thread(runThread1);
		t1.setName("t1 기능");
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();

		Runnable runThread2 = new RunnableThread();
		Thread t2 = new Thread(runThread2);
		t2.start();
		// 우선순위
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
