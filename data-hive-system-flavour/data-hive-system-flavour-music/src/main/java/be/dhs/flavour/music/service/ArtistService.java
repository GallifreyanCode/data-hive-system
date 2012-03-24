package be.dhs.flavour.music.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.dhs.flavour.music.Artist;
import be.dhs.persistence.repo.CreatorRepo;

@Service
public class ArtistService {
	CreatorRepo<Artist> dao;

	@Autowired
	public final void setDao(final CreatorRepo<Artist> dao) {
		this.dao = dao;
	}
	/**
	 * TODO: Try to define crud operations in an abstract service
	 */
	public Artist save(Artist director){
		return dao.save(director);
	}
	
	public Artist findByName(String string) {
		return dao.findByName(string);
	}
}
