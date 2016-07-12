package fr.adaming.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="gerants")
public class Gerant implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_gerant")
	private int id;
	private String nom;
	private String prenom;
	
	private Agence agence;
	private String password;
	
	/**
	 * Getters & setters 
	 * @return
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Agence getAgence() {
		return agence;
	}
	public void setAgence(Agence agence) {
		this.agence = agence;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * Constructeur plein
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param agence
	 * @param password
	 */
	public Gerant(int id, String nom, String prenom, Agence agence,
			String password) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.agence = agence;
		this.password = password;
	}
	
	/**
	 * Constructeur sans id
	 * @param nom
	 * @param prenom
	 * @param agence
	 * @param password
	 */
	public Gerant(String nom, String prenom, Agence agence, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.agence = agence;
		this.password = password;
	}
	
	/**
	 * Constructeur vide
	 */
	public Gerant() {
		super();
	}
	
	
	

}
