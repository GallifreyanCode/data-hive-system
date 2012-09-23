package be.dhs.rest.exception;

public class InvalidTagException extends RuntimeException {
	private static final long serialVersionUID = 6094762101293186249L;

	public InvalidTagException() {
		super();
	}

	public InvalidTagException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidTagException(String message) {
		super(message);
	}

	public InvalidTagException(Throwable cause) {
		super(cause);
	}

}
