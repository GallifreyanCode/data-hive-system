package be.dhs.itest.jpa.service.film;

import static org.fest.assertions.Assertions.assertThat;
import javax.inject.Inject;

import org.junit.Test;
import be.dhs.flavour.film.Director;
import be.dhs.flavour.film.service.DirectorService;
import be.dhs.itest.jpa.AbstractJPATest;

public class DirectorServiceITest extends AbstractJPATest {
	
	private static final String DIRECTOR_NAME = "Director1";
	
	@Inject DirectorService directorService;
	
	@Test
	public void whenDirectorIsSavedThenTheDirectorShouldBeFoundInDB() {
		Director sample = new Director();
		sample.setId(1L);
		sample.setName(DIRECTOR_NAME);
		assertThat(directorService.findByName(DIRECTOR_NAME)).isNull();
		directorService.create(sample);
		
		assertThat(sample.getId()).isNotNull();
		assertThat(directorService.findByName(DIRECTOR_NAME)).isNotNull();
	}
}
