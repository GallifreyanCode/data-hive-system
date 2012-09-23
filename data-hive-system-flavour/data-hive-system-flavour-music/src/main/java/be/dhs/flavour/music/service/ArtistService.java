package be.dhs.flavour.music.service;

import javax.inject.Named;

import be.dhs.flavour.music.Artist;
import be.dhs.persistence.repo.service.abs.AbstractCreatorService;

@Named
public class ArtistService extends AbstractCreatorService<Artist> {

	public ArtistService() {
		super();
	}
}
