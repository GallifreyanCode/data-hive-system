package be.dhs.api;

public enum EntityType {
	DIRECTOR("DIRECTOR"),
	FILM("FILM"),
	ARTIST("ARTIST"),
	ALBUM("ALBUM"),
	SONG("SONG");
	
	private String type;
	
	EntityType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return getType();
	}
}
