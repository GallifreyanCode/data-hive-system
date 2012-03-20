package be.dhs.flavour.film;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import be.dhs.flavour.film.Director;
import be.dhs.flavour.film.Film;
import be.dhs.persistence.repo.CreationRepo;
import be.dhs.persistence.repo.CreatorRepo;
import be.dhs.spring.application.ContextConfig;
import be.dhs.spring.persistence.PersistenceJPAConfig;

/** Fast created tests to act as proof of concept.
 * @author	GallifreyanCode
 * @version	0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ContextConfig.class, PersistenceJPAConfig.class}, loader = AnnotationConfigContextLoader.class)
public class TestingFilm {
	private static final Logger logger = LoggerFactory.getLogger(TestingFilm.class);
	@Autowired
	CreatorRepo<Director> directorRepo;
	@Autowired
	CreationRepo<Film> filmRepo;

	@Test
	public void testSaveDirector() {
		Director sample = new Director();
		sample.setId(1L);
		sample.setName("Director1");
		directorRepo.save(sample);
		assertNotNull("id should not be null", sample.getId());
		assertEquals(sample.getId(), directorRepo.findAll().get(0).getId());
		Director director = directorRepo.findByName("Director1");
		logger.debug(director.getName());
	}
	
	@Test
	public void testSaveFilm(){
		Film sample = new Film();
		sample.setId(1L);
		sample.setName("Film1");
		filmRepo.save(sample);
		assertNotNull("id should not be null", sample.getId());
		assertEquals(sample.getId(), filmRepo.findAll().get(0).getId());
		Film film = filmRepo.findByName("Film1");
		logger.debug(film.getName());	
	}
}
