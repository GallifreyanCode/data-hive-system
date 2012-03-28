package be.dhs.spring.mongo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.Mongo;
import com.mongodb.WriteConcern;

@Configuration
@ImportResource("classpath*:*springDataMongoDBConfig.xml")
@ComponentScan(basePackages={"be.dhs.persistence.mongo","be.dhs.flavour.music.mongo"})
public class PersistenceMongoDBConfig {
	@Value( "${mongo.name}" ) private String mongoName;
	 
	@Bean
	public MongoDbFactory mongoDbFactory() throws Exception {
		return new SimpleMongoDbFactory(new Mongo(), mongoName);
	}

	@Bean
	public MongoTemplate mongoTemplate() throws Exception {
		MongoTemplate template = new MongoTemplate(mongoDbFactory());
		template.setWriteConcern(WriteConcern.SAFE);
		return template;
	}
}
