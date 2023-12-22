package step03;

public class LogTest {

	public static void main(String[] args) {
		
		String admin = "admin";
		String user = "it";
		
		Log log = Log.getInstance();
		System.out.println(log);
		
		if(user == admin) {
			System.out.println(log.loginSuccess());
		} else {
			System.out.println(log.loginFail());
		}
		
		
		if(user == "backend") {
			System.out.println(log.loginSuccess());
		} else {
			System.out.println(log.loginFail());
		}

		
		
		
		
		
	}

}
