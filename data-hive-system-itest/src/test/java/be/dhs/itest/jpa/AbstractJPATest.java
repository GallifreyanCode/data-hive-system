package be.dhs.itest.jpa;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import be.dhs.spring.application.ContextConfig;
import be.dhs.spring.persistence.PersistenceJPAConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ContextConfig.class, PersistenceJPAConfig.class}, loader = AnnotationConfigContextLoader.class)
public abstract class AbstractJPATest {
	
}
