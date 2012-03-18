package be.dhs.api;

public interface DocumentEntity {
	String getId();
    void setId(final String id);
    Integer getVersion();
    void setVersion(Integer version);
    String getName();
    void setName(String name);    
}
