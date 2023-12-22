package step01;

// 데몬 스레드
class AutoSaveThread extends Thread {
	
	public void save() {
		System.out.println("작업 내용 저장");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			save();
		}
	}
}

// 스레드 그룹
class StudyThread extends Thread {
	
	public StudyThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup, threadName);
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(getName() + "interrupted");
				break;
			}
		}
		System.out.println(getName() + "종료");
	}
}

public class Ex09ThreadGroup {
	public static void main(String[] args) {
		// 데몬 스레드
		
//		AutoSaveThread auto = new AutoSaveThread();
//		auto.setDaemon(true);
//		auto.start();
//		
//		try {
//			Thread.sleep(3000);
//		} catch(InterruptedException e) {
//			e.printStackTrace();
//		}		
		
		
		// 스레드 그룹
		ThreadGroup dev = new ThreadGroup("dev");
		StudyThread java = new StudyThread(dev, "java");
		StudyThread js = new StudyThread(dev, "js");
		
		java.start();
		js.start();
		
		dev.interrupt();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}