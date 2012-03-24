package be.dhs.flavour.music.mongo;

import org.springframework.data.mongodb.core.mapping.Document;

import be.dhs.persistence.mongo.abs.MongoAbstractCreator;

@Document
public class Artist extends MongoAbstractCreator {
	private static final long serialVersionUID = 7366843651301506451L;

	public Artist(){
        super();
    }
}
