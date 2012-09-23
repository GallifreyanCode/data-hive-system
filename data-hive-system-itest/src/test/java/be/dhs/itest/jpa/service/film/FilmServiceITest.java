package be.dhs.itest.jpa.service.film;

import static org.fest.assertions.Assertions.assertThat;
import javax.inject.Inject;

import org.junit.Test;
import be.dhs.flavour.film.Film;
import be.dhs.flavour.film.service.FilmService;
import be.dhs.itest.jpa.AbstractJPATest;

public class FilmServiceITest extends AbstractJPATest {

	private static final String FILM_NAME = "Film1";
	
	@Inject FilmService filmService;
	
	@Test
	public void whenFilmIsSavedThenTheFilmShouldBeFoundInDB(){
		Film sample = new Film();
		sample.setId(1L);
		sample.setName(FILM_NAME);
		assertThat(filmService.findByName(FILM_NAME)).isNull();
		filmService.create(sample);
		
		assertThat(sample.getId()).isNotNull();
		assertThat(filmService.findByName(FILM_NAME)).isNotNull();
	}
}
