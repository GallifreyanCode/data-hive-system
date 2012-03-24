package be.dhs.persistence.repo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.dhs.persistence.abs.AbstractCreator;
import be.dhs.persistence.repo.CreatorRepo;

@Service
public class CreatorServiceImpl implements CreatorService<AbstractCreator> {
	@Autowired
	CreatorRepo<AbstractCreator> creatorRepo;
	
	public AbstractCreator create(AbstractCreator t) {
		return creatorRepo.save(t);
	}

	public List<AbstractCreator> findAll() {
		return creatorRepo.findAll();
	}

	@Override
	public AbstractCreator find(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AbstractCreator update(AbstractCreator t) {
		// TODO Auto-generated method stub
		return null;
	}
}
