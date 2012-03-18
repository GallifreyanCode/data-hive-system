package be.dhs.persistence.mongodb.service;

import java.util.List;

import be.dhs.api.role.document.Creator;

public interface CreatorService<T extends Creator> {
	T create(T t);
	T find(String id);
	void remove(String id);
	T update(T t);
	List<T> findAll();
}
