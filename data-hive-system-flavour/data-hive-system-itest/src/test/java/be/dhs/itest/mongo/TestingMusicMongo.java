package be.dhs.itest.mongo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import be.dhs.flavour.music.mongo.Artist;
import be.dhs.flavour.music.mongo.service.MongoArtistService;
import be.dhs.spring.application.ContextConfig;
import be.dhs.spring.mongo.PersistenceMongoDBConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ContextConfig.class, PersistenceMongoDBConfig.class}, loader = AnnotationConfigContextLoader.class)
public class TestingMusicMongo {

	@Autowired MongoArtistService artistService;

	@Test
	public void testSaveArtistdf() {
		Artist artist = new Artist();
		artist.setName("TestName2");
		int count = artistService.findAll().size();
		artistService.create(artist);
		for(Artist a : artistService.findAll()){
			System.out.println(a.getId() + " " + a.getName());
		}
		assertEquals(artistService.findAll().size(), count+1);
	}
}
