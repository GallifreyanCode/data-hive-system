package be.dhs.itest.mongo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import be.dhs.flavour.music.mongo.Artist;
import be.dhs.flavour.music.mongo.service.MongoArtistService;

public class ITMongo extends AbstractMongoTest {
	
	@Autowired MongoArtistService artistService;

	@Test
	public void testSaveArtist() {
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
