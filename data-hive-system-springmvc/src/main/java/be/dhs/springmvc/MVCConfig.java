package be.dhs.springmvc;

import java.util.Arrays;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.Mongo;
import com.mongodb.WriteConcern;

@Configuration
@ComponentScan(basePackages={"be.dhs"})
@EnableCaching
public class MVCConfig {

	@Bean
	public MongoDbFactory mongoDbFactory() throws Exception {
		return new SimpleMongoDbFactory(new Mongo(), "restbucks");
	}

	@Bean
	public MongoTemplate mongoTemplate() throws Exception {
		MongoTemplate template = new MongoTemplate(mongoDbFactory());
		template.setWriteConcern(WriteConcern.SAFE);
		return template;
	}

	@Bean
	public CacheManager cacheManager() throws Exception {
		SimpleCacheManager simpleCache = new SimpleCacheManager();
		simpleCache.setCaches(Arrays.asList(new ConcurrentMapCache("tags")));
		return simpleCache;
	}

// extends AbstractMongoConfiguration	@Override
//	public String getDatabaseName() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Mongo mongo() throws Exception {
//		// TODO Auto-generated method stub
//		return new Mongo("localhost");
//	}

}
