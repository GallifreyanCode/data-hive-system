package be.dhs.itest.jpa.service.music;

import static org.fest.assertions.Assertions.assertThat;
import javax.inject.Inject;

import org.junit.Test;
import be.dhs.flavour.music.Album;
import be.dhs.flavour.music.service.AlbumService;
import be.dhs.itest.jpa.AbstractJPATest;

public class AlbumServiceITest extends AbstractJPATest {

	private static final String ALBUM_NAME = "Album1";
	
	@Inject AlbumService albumService;
	
	@Test
	public void whenAlbumIsSavedThenTheAlbumShouldBeFoundInDB() {
		Album sample = new Album();
		sample.setId(1L);
		sample.setName(ALBUM_NAME);
		assertThat(albumService.findByName(ALBUM_NAME)).isNull();
		albumService.create(sample);
		
		assertThat(sample.getId()).isNotNull();
		assertThat(albumService.findByName(ALBUM_NAME)).isNotNull();
	}
}
