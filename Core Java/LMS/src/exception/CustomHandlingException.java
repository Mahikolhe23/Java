package exception;

//@SuppressWarnings("serial")
public class CustomHandlingException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Exceptin Ctor taking string msg and pass to super class
	public CustomHandlingException(String msg) {
		super(msg);
	}
}
