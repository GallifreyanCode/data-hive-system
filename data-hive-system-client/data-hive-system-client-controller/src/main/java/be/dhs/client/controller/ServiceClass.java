package be.dhs.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.dhs.flavor.music.Artist;
import be.dhs.persistence.repo.CreatorRepo;
/**
 * Just a test.
 * @author	GallifreyanCode
 * @version 0
 */
@Service
public class ServiceClass {
	@Autowired
	CreatorRepo<Artist> artistRepo;
	
	public void addArtist(String name){
		System.out.println("AddArtist");
		Artist sample = new Artist();
		//sample.setId(1L);
		sample.setName(name);
		artistRepo.save(sample);
		//Artist artist = artistRepo.findByName("Artist1");
	}
}
