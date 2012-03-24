package be.dhs.itest.mongo;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import be.dhs.itest.exceptions.DatabaseDoesNotExistException;
import be.dhs.itest.exceptions.MongoNotFoundException;
import be.dhs.spring.application.ContextConfig;
import be.dhs.spring.mongo.PersistenceMongoDBConfig;

import com.mongodb.Mongo;

/**
 * The abstract mongo test class. It checks if there's a running mongodb.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ContextConfig.class, PersistenceMongoDBConfig.class}, loader = AnnotationConfigContextLoader.class)
public abstract class AbstractMongoTest {
	//@Value("${mongo.name}") private String mongoName;
	private Mongo m;
	//private DB db;

	@Before
	public void setUp() throws MongoNotFoundException, DatabaseDoesNotExistException {
		testMongoIsFound();
	}
	
	public void testMongoIsFound() throws MongoNotFoundException {
		try {
			m = new Mongo("localhost", 27017);
			m.getDatabaseNames();
		} catch (Exception e) {
			throw new MongoNotFoundException();
		}
	}
}
