package be.dhs.persistence.mongodb.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

import be.dhs.api.role.document.Creation;

@NoRepositoryBean
public interface CreationRepo<T extends Creation> extends MongoRepository<T, String> {
	
}
