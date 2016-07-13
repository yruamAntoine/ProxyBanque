package fr.adaming.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@Entity
@Table(name="compteCourants")
@MappedSuperclass
public class CompteCourant extends Compte implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private double decouvertAutorise=1000;


	public CompteCourant(double decouvertAutorise) {
		super();
		this.decouvertAutorise = decouvertAutorise;
	}


	public CompteCourant() {
		super();
	}


	public double getDecouvertAutorise() {
		return decouvertAutorise;
	}


	public void setDecouvertAutorise(double decouvertAutorise) {
		this.decouvertAutorise = decouvertAutorise;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	

}
