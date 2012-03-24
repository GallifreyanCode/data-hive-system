package be.dhs.persistence.mongo.abs;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import be.dhs.api.role.document.Creation;

@Document
public abstract class MongoAbstractCreation implements Creation, Serializable {
	private static final long serialVersionUID = 7843682500904580609L;

	@Id
	private String id;
	private Integer version;
	private String name;

	public MongoAbstractCreation() {

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
