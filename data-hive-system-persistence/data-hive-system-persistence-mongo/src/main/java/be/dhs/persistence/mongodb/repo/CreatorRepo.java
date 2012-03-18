package be.dhs.persistence.mongodb.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

import be.dhs.api.role.document.Creator;

@NoRepositoryBean
public interface CreatorRepo<T extends Creator> extends MongoRepository<T, String> {
}
