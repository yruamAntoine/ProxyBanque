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
	
	private boolean entreprise;

	/**
	 * Constructeurs pleins
	 * @param id
	 * @param solde
	 * @param client
	 * @param dateOuverture
	 * @param entreprise
	 */
	public Compte(int id, double solde, Client client, Date dateOuverture,
			boolean entreprise) {
		super();
		this.id = id;
		this.solde = solde;
		this.client = client;
		this.dateOuverture = dateOuverture;
		this.entreprise = entreprise;
	}

	/**
	 * Constructeur sans id
	 * @param solde
	 * @param client
	 * @param dateOuverture
	 * @param entreprise
	 */
	public Compte(double solde, Client client, Date dateOuverture,
			boolean entreprise) {
		super();
		this.solde = solde;
		this.client = client;
		this.dateOuverture = dateOuverture;
		this.entreprise = entreprise;
	}

	/**
	 * Constructeur vide
	 */
	public Compte() {
		super();
	}

	/**
	 * Setters &getters
	 * @return
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Date getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(Date dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	public boolean isEntreprise() {
		return entreprise;
	}

	public void setEntreprise(boolean entreprise) {
		this.entreprise = entreprise;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
