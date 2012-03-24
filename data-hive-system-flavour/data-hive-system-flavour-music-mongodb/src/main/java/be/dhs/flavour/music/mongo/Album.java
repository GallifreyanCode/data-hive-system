package be.dhs.flavour.music.mongo;

import org.springframework.data.mongodb.core.mapping.Document;

import be.dhs.persistence.mongo.abs.MongoAbstractCreation;

@Document
public class Album extends MongoAbstractCreation {
	private static final long serialVersionUID = 4364244128015185266L;

	public Album(){
		super();
	}

}
