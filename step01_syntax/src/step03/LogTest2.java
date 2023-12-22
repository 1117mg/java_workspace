package step03;

public class LogTest2 {

	public static void main(String[] args) {
		String user = "it";
		
		Log log = Log.getInstance();
		System.out.println(log);
		
		if(user == "frontend") {
			System.out.println(log.loginSuccess());
		} else {
			System.out.println(log.loginFail());
		}
		
		if(user =="backend") {
			System.out.println(log.loginSuccess());
		} else {
			System.out.println(log.loginFail());
		}

	}

}
