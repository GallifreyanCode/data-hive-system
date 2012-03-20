package be.dhs.flavour.music;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import be.dhs.flavour.music.Album;
import be.dhs.flavour.music.Artist;
import be.dhs.persistence.repo.CreationRepo;
import be.dhs.persistence.repo.CreatorRepo;
import be.dhs.spring.application.ContextConfig;
import be.dhs.spring.persistence.PersistenceJPAConfig;

/** Fast created tests to act as proof of concept.
 * @author	GallifreyanCode
 * @version	0
 */
@RunWith(SpringJUnit4ClassRunner.class)
/*@ImportResource("classpath*:contextConfig.xml")
@ComponentScan({ "be.dhs" })*/
@ContextConfiguration(classes = {ContextConfig.class, PersistenceJPAConfig.class}, loader = AnnotationConfigContextLoader.class)
public class TestingMusic {

	@Autowired
	CreatorRepo<Artist> artistRepo;
	@Autowired
	CreationRepo<Album> albumRepo;

	@Test
	public void testSaveArtist() {
		Artist sample = new Artist();
		sample.setId(1L);
		sample.setName("Artist1");
		artistRepo.save(sample);
		assertNotNull("id should not be null", sample.getId());
		assertEquals(sample.getId(), artistRepo.findAll().get(0).getId());
		Artist artist = artistRepo.findByName("Artist1");
		System.out.println(artist.getName());
		// sampleRepository.delete(artist);
	}

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
	}

	@Test
	public void testSaveAlbum() {
		Album sample = new Album();
		sample.setId(1L);
		sample.setName("AlbumName");
		albumRepo.save(sample);
		assertNotNull("id should not be null", sample.getId());
		assertEquals(sample.getId(), albumRepo.findAll().get(0).getId());
		Album album = albumRepo.findByName("AlbumName");
		System.out.println(album.getName());
		// sampleRepository.delete(artist);
	}

}
