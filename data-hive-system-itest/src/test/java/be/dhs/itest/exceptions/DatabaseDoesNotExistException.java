package be.dhs.itest.exceptions;

import java.io.IOException;

public class DatabaseDoesNotExistException extends IOException {
	private static final long serialVersionUID = -7541970975064766351L;
	
	public DatabaseDoesNotExistException() {
		super("Mongo database does not exist!");
	}
}
