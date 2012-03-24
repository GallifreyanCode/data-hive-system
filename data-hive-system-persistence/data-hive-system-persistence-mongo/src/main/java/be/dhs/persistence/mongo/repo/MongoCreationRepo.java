package be.dhs.persistence.mongo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

import be.dhs.api.role.document.Creation;

@NoRepositoryBean
public interface MongoCreationRepo<T extends Creation> extends MongoRepository<T, String> {
	
}
