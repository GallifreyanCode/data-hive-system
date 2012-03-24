package be.dhs.itest.exceptions;

import java.io.IOException;

public class MongoNotFoundException extends IOException {
	private static final long serialVersionUID = -7541970975064766351L;
	
	public MongoNotFoundException() {
		super("MongoDB not found, check it's running!");
	}
}
