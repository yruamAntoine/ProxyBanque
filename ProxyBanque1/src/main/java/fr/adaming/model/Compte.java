package fr.adaming.model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public abstract class Compte implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private double solde;
	private Client client;
	
	// Constructeurs
	
	/**
	 * Constructeur vide
	 */
	public Compte() {
		super();
	}
	
	/**
	 * Constructeur sans id
	 * @param solde
	 * @param client
	 */
	public Compte(double solde, Client client) {
		super();
		this.solde = solde;
		this.client = client;
	}
	
	/**
	 * Constructeur full
	 * @param id
	 * @param solde
	 * @param client
	 */
	public Compte(int id, double solde, Client client) {
		super();
		this.id = id;
		this.solde = solde;
		this.client = client;
	}
	
	//Getters et Setters
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	/**
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}
	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}
	
	

}
