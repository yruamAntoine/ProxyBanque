package fr.adaming.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="compteEpagnes")
public class CompteEpargne extends Compte implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double taux_remuneration=0.03;

	
	//Constructeurs
	
	/**
	 * Constructeur vide
	 */
	public CompteEpargne() {
		super();
	}

	/**
	 * Constructeur full
	 * @param taux_remuneration
	 */
	public CompteEpargne(double taux_remuneration) {
		super();
		this.taux_remuneration = taux_remuneration;
	}

	
	// Getters et Setters
	
	/**
	 * @return the taux_remuneration
	 */
	public double getTaux_remuneration() {
		return taux_remuneration;
	}

	/**
	 * @param taux_remuneration the taux_remuneration to set
	 */
	public void setTaux_remuneration(double taux_remuneration) {
		this.taux_remuneration = taux_remuneration;
	}
	
	

}
