package be.dhs.api.role.service;

import be.dhs.api.role.entity.Creator;

public interface CreatorService<T extends Creator> { 
   /* List<T> findAll();
    T create(final T entity);
    void update(final T entity);
    void delete(final long id);
    void deleteAll();*/
	T save(final T entity);
	T findByName(String name);
}
