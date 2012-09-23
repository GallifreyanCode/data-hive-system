package be.dhs.persistence.repo.service.abs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import be.dhs.api.role.entity.Creation;
import be.dhs.api.role.service.CreationService;
import be.dhs.persistence.repo.CreationRepo;

public abstract class AbstractCreationService<T extends Creation> implements CreationService<T> {
	
	private CreationRepo<T> creationRepo;
	
	@Autowired
	public final void setRepo(final CreationRepo<T> creationRepo) {
		this.creationRepo = creationRepo;
	}
	
	public AbstractCreationService(){}
	
	public T create(T t) {
		return creationRepo.save(t);
	}

	public T find(Long id) {
		return creationRepo.findOne(id);
	}

	public void remove(Long id) {
		creationRepo.delete(id);
	}

	public T update(T t) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<T> findAll() {
		List<T> list = new ArrayList<T>();
		for(T t : creationRepo.findAll()) {
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
