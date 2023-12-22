package step01;

class Info{
	
}

public class Ex02Exception {

	public static void main(String[] args) {
		
		try {
			Class.forName("step01.info");
			
			String str = null;
			System.out.println(str.length());
			
		} catch(ClassNotFoundException | NumberFormatException e) {
//			e.printStackTrace();
			System.out.println("ClassNotFoundException 처리코드");
		} catch(NullPointerException e){
//			e.printStackTrace();
			System.out.println("NPE 처리 코드");
		} catch(Exception e) {
			System.out.println("모든 예외 처리 코드");
		} finally {
				System.out.println("finally");
		}
	}

}
