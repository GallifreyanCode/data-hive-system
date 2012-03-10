package be.dhs.api;

import java.util.List;

import be.dhs.api.role.Creator;

/**
 * @deprecated at the moment
 */
public interface Service<T extends Creator>{
    List<T> findAll();
    T create(final T entity);
    void update(final T entity);
    void delete(final long id);
    void deleteAll();
}
