package Exception;

public class InvalidEmailFormatException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidEmailFormatException(String message) {
        super(message);
    }
}
