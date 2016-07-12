package fr.adaming.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="compteCourants")
public class CompteCourant extends Compte implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private double decouvertAutorise=1000;
	
	
	// Constructeurs

	/**
	 * @param decouvertAutorise
	 */
	public CompteCourant(double decouvertAutorise) {
		super();
		this.decouvertAutorise = decouvertAutorise;
	}

	

	public CompteCourant() {
		super();
	}



	// Getters et Setters

	/**
	 * @return the decouvertAutorise
	 */
	public double getDecouvertAutorise() {
		return decouvertAutorise;
	}
	
	/**
	 * @param decouvertAutorise the decouvertAutorise to set
	 */
	public void setDecouvertAutorise(double decouvertAutorise) {
		this.decouvertAutorise = decouvertAutorise;
	}
	
	
	

}
