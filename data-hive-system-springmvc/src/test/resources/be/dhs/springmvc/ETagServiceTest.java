package be.dhs.springmvc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import be.dhs.flavour.music.Artist;
import be.dhs.rest.exception.InvalidTagException;
import be.dhs.rest.service.ETagService;
import be.dhs.spring.application.ContextConfig;
import be.dhs.spring.persistence.PersistenceJPAConfig;
import be.dhs.springmvc.config.DispatcherConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ImportResource("classpath*:contextConfig.xml")
@ComponentScan({ "be.dhs" })
@ContextConfiguration(classes={ContextConfig.class, MVCConfig.class, PersistenceJPAConfig.class, DispatcherConfig.class})
public class ETagServiceTest {

	@Autowired
	private ETagService service;


	@Test
	public void testCreateTag() throws Exception{
		Artist artist = new Artist();
		String url = "http://localhost:8080/restbucks/artists/1";
		artist.setId(1L);
		artist.setName("Test");
		//artist.setStatus(OrderStatus.PENDING);
		String tag = service.generate(url, artist);
		System.out.println(tag);
		service.remove(url);
	}

	@Test(expected=InvalidTagException.class) 
	public void testInvalidTag() throws Exception{
		String tag = service.get("http://neverfound.com");
	}


//	@Test
//	public void updateTag() throws Exception {
//		Order order = new Order();
//		String url = "http://localhost:8080/restbucks/orders/abc";
//		order.setId("abc");
//		order.setStatus(OrderStatus.PENDING);
//		String tag = service.generate(url, order);
//		order.setStatus(OrderStatus.SERVED);
//		String newTag = service.update(url, order);
//		String check = service.get(url);
//		Assert.assertEquals(newTag, check);
//		service.remove(url);
//	}
}
