package be.dhs.rest.exception;

public class EntityNotFoundException extends RuntimeException {
	private static final long serialVersionUID = -6346225983791135483L;

	public EntityNotFoundException() {
		super();
	}

	public EntityNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public EntityNotFoundException(String message) {
		super(message);
	}

	public EntityNotFoundException(Throwable cause) {
		super(cause);
	}

}
