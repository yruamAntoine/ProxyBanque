package fr.adaming.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	
	@ManyToOne
	private Gerant gerant;
	
	@OneToMany(mappedBy="conseiller")
	private List<Client> clients;

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

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Conseiller(int id, String nom, String prenom, Gerant gerant, List<Client> clients) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.gerant = gerant;
		this.clients = clients;
	}

	public Conseiller(String nom, String prenom, Gerant gerant, List<Client> clients) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.gerant = gerant;
		this.clients = clients;
	}

	public Conseiller(String nom, String prenom, Gerant gerant) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.gerant = gerant;
	}

	public Conseiller() {
		super();
	}

	
	
	
	
	
	
}
