package be.dhs.itest.jpa.service.music;

import static org.fest.assertions.Assertions.assertThat;
import javax.inject.Inject;

import org.junit.Test;
import be.dhs.flavour.music.Artist;
import be.dhs.flavour.music.service.ArtistService;
import be.dhs.itest.jpa.AbstractJPATest;

public class ArtistServiceITest extends AbstractJPATest {

	private static final String ARTIST_NAME = "Artist1";
	
	@Inject ArtistService artistService;
	
	@Test
	public void whenArtistIsSavedThenTheArtistShouldBeFoundInDB() {
		Artist sample = new Artist();
		sample.setName(ARTIST_NAME);
		assertThat(artistService.findByName(ARTIST_NAME)).isNull();
		artistService.create(sample);
		
		assertThat(sample.getId()).isNotNull();
		assertThat(artistService.findByName(ARTIST_NAME)).isNotNull();
	}
}
