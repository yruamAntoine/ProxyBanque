package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Agence;

public interface IAgenceService {

	public void createAgence(Agence agence);

	public List<Agence> getAllAgences();

	public Agence getAgenceById(String id);

	public void deleteAgence(Agence agence);

}
