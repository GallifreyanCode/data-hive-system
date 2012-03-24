package be.dhs.persistence.repo.service.abs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import be.dhs.api.role.entity.Creator;
import be.dhs.persistence.repo.CreatorRepo;
import be.dhs.persistence.repo.service.CreatorService;

public abstract class AbstractCreatorService<T extends Creator> implements CreatorService<T> {
	
	@Autowired
	private CreatorRepo<T> creatorRepo;
	
	public AbstractCreatorService(){}
	
	public T create(T t) {
		return creatorRepo.save(t);
	}

	public T find(String id) {
		return creatorRepo.findAll().get(0);
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
