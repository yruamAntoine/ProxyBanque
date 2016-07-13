package fr.adaming.managedBean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import fr.adaming.model.Agence;
import fr.adaming.service.IAgenceService;

@ManagedBean(name = "agenceMB")
@SessionScoped
public class AgenceManagedBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1897298773402983790L;

	@ManagedProperty(value = "#{agenceServiceBean}")
	IAgenceService agenceService;

	private Agence agence;

	private List<Agence> listeAgence;

	public AgenceManagedBean() {
		this.agence = new Agence();
	}

	/**
	 * Getters & setters
	 * @return
	 */
	public IAgenceService getAgenceService() {
		return agenceService;
	}

	public void setAgenceService(IAgenceService agenceService) {
		this.agenceService = agenceService;
	}

	public Agence getAgence() {
		return agence;
	}

	public void setAgence(Agence agence) {
		this.agence = agence;
	}

	public List<Agence> getListeAgence() {
		return listeAgence;
	}

	public void setListeAgence(List<Agence> listeAgence) {
		this.listeAgence = listeAgence;
	}
	
	/**
	 * Methodes
	 * @return
	 */
	public String ajouter() {
		agenceService.createAgence(agence);
		//listeAgence = agenceService.getAllAgences();
		return "succes";
	}
	
}
