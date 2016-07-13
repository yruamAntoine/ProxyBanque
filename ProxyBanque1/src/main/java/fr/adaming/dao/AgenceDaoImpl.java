package fr.adaming.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.adaming.model.Agence;

@Repository
public class AgenceDaoImpl implements IAgenceDao {


	
	@Autowired
	private SessionFactory sessionFactory;

	// Un setter pour l'injection en Spring.

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	@Override
	public void createAgence(Agence agence) {
		Session session = sessionFactory.openSession();
		session.save(agence);
		session.close();
	}

	@Override
	public List<Agence> getAllAgences() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Agence getAgenceById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAgence(Agence agence) {
		// TODO Auto-generated method stub

	}

}
