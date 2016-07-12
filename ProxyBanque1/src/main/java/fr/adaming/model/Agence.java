package fr.adaming.model;

import java.util.Date;

public class Agence {
	
	private int id;
	private Date dateCreation;
	
	// Constructeurs
		// - vide
	public Agence() {
		super();
	}
	
		// - sans Id
	public Agence(Date dateCreation) {
		super();
		this.dateCreation = dateCreation;
	}
	
		// - full
	public Agence(int id, Date dateCreation) {
		super();
		this.id = id;
		this.dateCreation = dateCreation;
	}
	
	// Getters et Setters
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	
	

}
