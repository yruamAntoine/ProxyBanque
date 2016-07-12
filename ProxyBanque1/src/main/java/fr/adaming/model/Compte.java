package fr.adaming.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comptes")
public abstract class Compte implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_compte")
	private int id;
	private double solde;
	private Client client;
	
	private Date dateOuverture;
	
	// Constructeurs
	
	/**
	 * Constructeur vide
	 */
	public Compte() {
		super();
	}
	

	
	public Compte(double solde, Client client, Date dateOuverture) {
		super();
		this.solde = solde;
		this.client = client;
		this.dateOuverture = dateOuverture;
	}



	
	
	public Compte(int id, double solde, Client client, Date dateOuverture) {
		super();
		this.id = id;
		this.solde = solde;
		this.client = client;
		this.dateOuverture = dateOuverture;
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



	public Date getDateOuverture() {
		return dateOuverture;
	}



	public void setDateOuverture(Date dateOuverture) {
		this.dateOuverture = dateOuverture;
	}
	
	

}
