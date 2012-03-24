package be.dhs.flavour.film.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.dhs.api.role.service.CreatorService;
import be.dhs.flavour.film.Director;
import be.dhs.persistence.repo.CreatorRepo;

@Service
public class DirectorService implements CreatorService<Director> {
	CreatorRepo<Director> dao;

	@Autowired
	public final void setDao(final CreatorRepo<Director> dao) {
		this.dao = dao;
	}
	/**
	 * TODO: Try to define crud operations in an abstract service
	 */
	public Director save(Director entity) {
		return dao.save(entity);
	}

	public Director findByName(String name) {
		return dao.findByName(name);
	}
}
