package be.dhs.api.role.service;

import be.dhs.api.role.entity.Creation;

public interface CreationService<T extends Creation> { 
   /* List<T> findAll();
    T create(final T entity);
    void update(final T entity);
    void delete(final long id);
    void deleteAll();*/
	T save(final T entity);
	T findByName(String name);
}
