package be.dhs.persistence.mongo.service;

import java.util.List;

import be.dhs.api.role.document.Creator;

public interface MongoCreatorService<T extends Creator> {
	T create(T t);
	T find(String id);
	void remove(String id);
	T update(T t);
	List<T> findAll();
}
