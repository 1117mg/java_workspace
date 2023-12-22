package exception;

// 사용자정의 예외처리

public class NotAdminException extends Exception{
	public NotAdminException(String msg) {
		super(msg);
	}
}
