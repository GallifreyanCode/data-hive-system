package be.dhs.itest.jpa;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import be.dhs.flavour.film.Director;
import be.dhs.flavour.film.Film;
import be.dhs.flavour.film.service.DirectorService;
import be.dhs.flavour.film.service.FilmService;
import be.dhs.flavour.music.Album;
import be.dhs.flavour.music.Artist;
import be.dhs.flavour.music.service.AlbumService;
import be.dhs.flavour.music.service.ArtistService;
import be.dhs.spring.application.ContextConfig;
import be.dhs.spring.persistence.PersistenceJPAConfig;

/** Fast created tests to act as proof of concept.
 * @author	GallifreyanCode
 * @version	0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ContextConfig.class, PersistenceJPAConfig.class}, loader = AnnotationConfigContextLoader.class)
public class IntegrationTesting {
	private static final Logger logger = LoggerFactory.getLogger(IntegrationTesting.class);

	@Autowired DirectorService directorService;
	@Autowired ArtistService artistService;
	@Autowired FilmService filmService;
	@Autowired AlbumService albumService;
	
	@Test
	public void testSaveDirector() {
		assertNotNull(logger);
		Director sample = new Director();
		sample.setId(1L);
		sample.setName("Director1");
		directorService.save(sample);
		assertNotNull("id should not be null", sample.getId());
		//assertEquals(sample.getId(), directorService.findAll().get(0).getId());
		Director director = directorService.findByName("Director1");
		assertNotNull(director);
		logger.info("fjsdfjsdjf");
		System.out.println(director.getName());
	}
	
	@Test
	public void testSaveArtist() {
		Artist sample = new Artist();
		sample.setId(1L);
		sample.setName("Artist1");
		artistService.save(sample);
		assertNotNull("id should not be null", sample.getId());
		//assertEquals(sample.getId(), artistRepo.findAll().get(0).getId());
		Artist artist = artistService.findByName("Artist1");
		assertNotNull(artist);
		System.out.println(artist.getName());
	}
	
	@Test
	public void testSaveFilm(){
		Film sample = new Film();
		sample.setId(1L);
		sample.setName("Film1");
		filmService.save(sample);
		assertNotNull("id should not be null", sample.getId());
		//assertEquals(sample.getId(), filmRepo.findAll().get(0).getId());
		Film film = filmService.findByName("Film1");
		System.out.println(film.getName());
		//logger.debug(film.getName());	
	}
	
	@Test
	public void testSaveAlbum() {
		Album sample = new Album();
		sample.setId(1L);
		sample.setName("AlbumName");
		albumService.save(sample);
		assertNotNull("id should not be null", sample.getId());
		//assertEquals(sample.getId(), albumRepo.findAll().get(0).getId());
		Album album = albumService.findByName("AlbumName");
		System.out.println(album.getName());
		//sampleRepository.delete(artist);
	}
	/*
	@Test
	public void testRemoveArtist() {
		Artist sample = new Artist();
		sample.setId(2L);
		sample.setName("Artist2");
		artistRepo.save(sample);
		assertNotNull("id should not be null", sample.getId());
		Artist artist = artistRepo.findByName("Artist2");
		System.out.println(artist.getName());
		artistRepo.delete(artist);
		assertNull(artistRepo.findByName("Artist2"));
	}*/
}
