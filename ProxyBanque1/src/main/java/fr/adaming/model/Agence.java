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
	
	/**
	 * Constructeur vide
	 */
	public Agence() {
		super();
	}
	
	/**
	 * COnstructeur sans id
	 * @param dateCreation
	 */
	public Agence(Date dateCreation) {
		super();
		this.dateCreation = dateCreation;
	}
	
	/**
	 * COnstructeur plein
	 * @param id
	 * @param dateCreation
	 */
	public Agence(int id, Date dateCreation) {
		super();
		this.id = id;
		this.dateCreation = dateCreation;
	}
	
	/**
	 * Getters & Setters
	 * @return
	 */
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
