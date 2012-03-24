package be.dhs.persistence.mongo.abs;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import be.dhs.api.role.document.Component;

@Document
public abstract class MongoAbstractComponent implements Component, Serializable {
	private static final long serialVersionUID = 5629853708214834899L;

	@Id
	private String id;
	private Integer version;
	private String name;

	public MongoAbstractComponent() {

	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
