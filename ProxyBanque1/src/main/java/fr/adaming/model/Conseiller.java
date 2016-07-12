package fr.adaming.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="conseillers")
public class Conseiller implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_conseiller")
	private int id;
	
	private String nom;
	private String prenom;
	
	private Gerant gerant;

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

	public Gerant getGerant() {
		return gerant;
	}

	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * Constructeur plein
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param gerant
	 */
	public Conseiller(int id, String nom, String prenom, Gerant gerant) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.gerant = gerant;
	}
	
	
	/**
	 * Constructeur sans id
	 * @param nom
	 * @param prenom
	 * @param gerant
	 */
	public Conseiller(String nom, String prenom, Gerant gerant) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.gerant = gerant;
	}

	/**
	 * Constructeur vide
	 */
	public Conseiller() {
		super();
	}
	
	
	
	
	
}
