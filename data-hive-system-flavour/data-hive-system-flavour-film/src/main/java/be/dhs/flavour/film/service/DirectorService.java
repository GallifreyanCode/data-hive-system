package be.dhs.flavour.film.service;

import javax.inject.Named;

import be.dhs.flavour.film.Director;
import be.dhs.persistence.repo.service.abs.AbstractCreatorService;

@Named
public class DirectorService extends AbstractCreatorService<Director> {
	
	public DirectorService() {
		super();
	}
}
