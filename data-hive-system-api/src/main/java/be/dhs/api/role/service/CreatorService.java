package be.dhs.api.role.service;

import java.util.List;

import be.dhs.api.role.entity.Creator;

public interface CreatorService<T extends Creator> { 
	T create(T t);
	T find(Long id);
	void remove(Long id);
	T update(T t);
	List<T> findAll();
	T findByName(String string);
}
