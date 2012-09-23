package be.dhs.persistence.repo.service.abs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import be.dhs.api.role.entity.Creator;
import be.dhs.api.role.service.CreatorService;
import be.dhs.persistence.repo.CreatorRepo;

public abstract class AbstractCreatorService<T extends Creator> implements CreatorService<T> {
	
	private CreatorRepo<T> creatorRepo;
	
	@Autowired
	public final void setRepo(final CreatorRepo<T> creatorRepo) {
		this.creatorRepo = creatorRepo;
	}
	
	public AbstractCreatorService(){}
	
	public T create(T t) {
		return creatorRepo.save(t);
	}

	public T find(Long id) {
		return creatorRepo.findOne(id);
	}

	public void remove(Long id) {
		creatorRepo.delete(id);
	}

	public T update(T t) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<T> findAll() {
		List<T> list = new ArrayList<T>();
		for(T t : creatorRepo.findAll()) {
			if(t.getType().equals(t.getClass().getSimpleName())) {
				list.add(t);
			}
		}
		return list;
	}
	
	public T findByName(String string) {
		for(T t : findAll()) {
			if(t.getName().equals(string)) {
				return t;
			}
		}
		return null;
	}
}
