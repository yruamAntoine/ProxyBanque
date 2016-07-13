package fr.adaming.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	
	@OneToOne(mappedBy="gerant")
	private Agence agence;
	private String password;
	
	@OneToMany(mappedBy="gerant")
	private Set<Conseiller> conseillers;

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

	public Set<Conseiller> getConseillers() {
		return conseillers;
	}

	public void setConseillers(Set<Conseiller> conseillers) {
		this.conseillers = conseillers;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Gerant(int id, String nom, String prenom, Agence agence, String password, Set<Conseiller> conseillers) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.agence = agence;
		this.password = password;
		this.conseillers = conseillers;
	}

	public Gerant(String nom, String prenom, Agence agence, String password, Set<Conseiller> conseillers) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.agence = agence;
		this.password = password;
		this.conseillers = conseillers;
	}

	public Gerant(String nom, String prenom, Agence agence, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.agence = agence;
		this.password = password;
	}

	public Gerant() {
		super();
	}
	
	
	

}
