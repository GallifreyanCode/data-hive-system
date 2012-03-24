package be.dhs.persistence.mongo.service.abs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import be.dhs.api.role.document.Creator;
import be.dhs.persistence.mongo.repo.MongoCreatorRepo;
import be.dhs.persistence.mongo.service.MongoCreatorService;

public abstract class MongoAbstractCreatorService<T extends Creator> implements MongoCreatorService<T> {
	
	@Autowired
	private MongoCreatorRepo<T> creatorRepo;
	
	public MongoAbstractCreatorService(){}
	
	public T create(T t) {
		return creatorRepo.save(t);
	}

	public T find(String id) {
		return creatorRepo.findOne(id);
	}

	public void remove(String id) {
		// TODO Auto-generated method stub
		
	}

	public T update(T t) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<T> findAll() {
		return creatorRepo.findAll();
	}
}
