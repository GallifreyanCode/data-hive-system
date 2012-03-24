package be.dhs.flavour.music.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import be.dhs.api.role.service.CreationService;
import be.dhs.flavour.music.Album;
import be.dhs.persistence.repo.CreationRepo;

@Service
public class AlbumService implements CreationService<Album> {
	CreationRepo<Album> dao;

	@Autowired
	public final void setDao(final CreationRepo<Album> dao) {
		this.dao = dao;
	}
	/**
	 * TODO: Try to define crud operations in an abstract service
	 */
	public Album save(Album entity) {
		return dao.save(entity);
	}

	public Album findByName(String name) {
		return dao.findByName(name);
	}
}
