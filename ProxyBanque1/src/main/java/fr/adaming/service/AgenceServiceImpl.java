package fr.adaming.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.dao.IAgenceDao;
import fr.adaming.model.Agence;

@Service("agence")
public class AgenceServiceImpl implements IAgenceService{
	
	@Autowired
	private IAgenceDao agenceDao;
	
	//setter pour l'injection
	public void setAgenceDao(IAgenceDao agenceDao) {
		this.agenceDao = agenceDao;
	}
	

	@Override
	@Transactional
	public void createAgence(Agence agence) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public List<Agence> getAllAgences() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Agence getAgenceById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void deleteAgence(Agence agence) {
		// TODO Auto-generated method stub
		
	}

}
