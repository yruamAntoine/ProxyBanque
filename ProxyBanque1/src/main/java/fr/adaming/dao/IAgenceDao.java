package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.Agence;

public interface IAgenceDao {
	
	public void createAgence(Agence agence);

	public List<Agence> getAllAgences();

	public Agence getAgenceById(String id);

	public void deleteAgence(Agence agence);


}
