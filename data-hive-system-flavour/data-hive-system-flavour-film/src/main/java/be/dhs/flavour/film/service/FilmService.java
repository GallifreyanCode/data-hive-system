package be.dhs.flavour.film.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.dhs.api.role.service.CreationService;
import be.dhs.flavour.film.Film;
import be.dhs.persistence.repo.CreationRepo;

@Service
public class FilmService implements CreationService<Film> {
	CreationRepo<Film> dao;

	@Autowired
	public final void setDao(final CreationRepo<Film> dao) {
		this.dao = dao;
	}
	/**
	 * TODO: Try to define crud operations in an abstract service
	 */
	public Film save(Film entity) {
		return dao.save(entity);
	}

	public Film findByName(String name) {
		return dao.findByName(name);
	}
}
