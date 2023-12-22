package step03;

public class Log {

	private static Log instance = new Log();
	
	private Log() {}
	
	public static Log getInstance() {
		return instance;
	}
	
	// 성공 출력 메소드
	public String loginSuccess() {
		return "로그인 성공";
	}
	
	// 실패 출력 메소드
	public String loginFail() {
		return "로그인 실패";
	}
	
}
