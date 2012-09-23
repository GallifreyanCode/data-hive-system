package be.dhs.itest.jpa.service;

import static org.fest.assertions.Assertions.assertThat;

import javax.inject.Inject;

import org.junit.Test;

import be.dhs.flavour.film.Director;
import be.dhs.flavour.film.Film;
import be.dhs.flavour.film.service.DirectorService;
import be.dhs.flavour.film.service.FilmService;
import be.dhs.flavour.music.Album;
import be.dhs.flavour.music.Artist;
import be.dhs.flavour.music.service.AlbumService;
import be.dhs.flavour.music.service.ArtistService;
import be.dhs.itest.jpa.AbstractJPATest;

/** Fast created tests to act as proof of concept.
 * @author	GallifreyanCode
 * @version	0
 */
public class ServiceSmokeTest extends AbstractJPATest {

	private static final String DIRECTOR_NAME = "Director1";
	private static final String ARTIST_NAME = "Artist1";
	private static final String FILM_NAME = "Film1";
	private static final String ALBUM_NAME = "Album1";

	@Inject DirectorService directorService;
	@Inject ArtistService artistService;
	@Inject FilmService filmService;
	@Inject AlbumService albumService;
	
	@Test
	public void testSaveDirector() {
		Director sample = new Director();
		sample.setName(DIRECTOR_NAME);
		assertThat(directorService.findByName(DIRECTOR_NAME)).isNull();
		directorService.create(sample);
		
		assertThat(sample.getId()).isNotNull();
		assertThat(directorService.findByName(DIRECTOR_NAME)).isNotNull();
		/* ACTUAL FIND ALL TEST */
		assertThat(directorService.findAll().size()).isGreaterThan(0);
	}
	
	@Test
	public void testSaveArtist() {
		Artist sample = new Artist();
		sample.setName(ARTIST_NAME);
		assertThat(artistService.findByName(ARTIST_NAME)).isNull();
		artistService.create(sample);
		
		assertThat(sample.getId()).isNotNull();
		assertThat(artistService.findByName(ARTIST_NAME)).isNotNull();
		assertThat(artistService.findAll().size()).isGreaterThan(0);
	}
	
	@Test
	public void testSaveFilm(){
		Film sample = new Film();
		sample.setName(FILM_NAME);
		assertThat(filmService.findByName(FILM_NAME)).isNull();
		filmService.create(sample);
		
		assertThat(sample.getId()).isNotNull();
		assertThat(filmService.findByName(FILM_NAME)).isNotNull();
		assertThat(filmService.findAll().size()).isGreaterThan(0);
	}
	
	@Test
	public void testSaveAlbum() {
		Album sample = new Album();
		sample.setName(ALBUM_NAME);
		assertThat(albumService.findByName(ALBUM_NAME)).isNull();
		albumService.create(sample);

		assertThat(sample.getId()).isNotNull();
		assertThat(albumService.findByName(ALBUM_NAME)).isNotNull();
		assertThat(albumService.findAll().size()).isGreaterThan(0);
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
