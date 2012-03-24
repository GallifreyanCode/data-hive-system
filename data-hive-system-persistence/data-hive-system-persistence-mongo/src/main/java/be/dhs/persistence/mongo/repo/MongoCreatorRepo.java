package be.dhs.persistence.mongo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

import be.dhs.api.role.document.Creator;

@NoRepositoryBean
public interface MongoCreatorRepo<T extends Creator> extends MongoRepository<T, String> {
}
