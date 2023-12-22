package blood.transfusion.exception;

@SuppressWarnings("serial")
public class NotExistException extends Exception{
	public NotExistException() {}
	public NotExistException(String msg) {
		super(msg);
	}
}