package except.starbucks;

public class CoffeeSoldOutException extends Throwable {
	public CoffeeSoldOutException(String msg) {
		super(msg);
	}
}
