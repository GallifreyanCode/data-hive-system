package be.dhs.api;

import be.dhs.api.role.entity.Creator;

public interface EntityService<T extends Creator>{
   /* List<T> findAll();
    T create(final T entity);
    void update(final T esntity);
    void delete(final long id);
    void deleteAll();*/
	T save(final T entity);
	T findByName(String name);
}
