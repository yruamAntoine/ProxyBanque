package fr.adaming.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="agences")
public class Agence implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4941417234676253217L;

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_agence")
	private int id;
	private Date dateCreation;
	
	@OneToOne
	private Gerant gerant;

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

	public Gerant getGerant() {
		return gerant;
	}

	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Agence(Date dateCreation, Gerant gerant) {
		super();
		this.dateCreation = dateCreation;
		this.gerant = gerant;
	}

	public Agence(Date dateCreation) {
		super();
		this.dateCreation = dateCreation;
	}

	public Agence() {
		super();
	}
	
	
	
	

}
