package fr.adaming.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@Entity
@Table(name="compteEpagnes")
public class CompteEpargne extends Compte implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double taux_remuneration=0.03;
	
	/**
	 * Constructeurs
	 * @return
	 */
	public double getTaux_remuneration() {
		return taux_remuneration;
	}
	public void setTaux_remuneration(double taux_remuneration) {
		this.taux_remuneration = taux_remuneration;
	}
	
	/**
	 * Getters & setters
	 * @return
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public CompteEpargne(double taux_remuneration) {
		super();
		this.taux_remuneration = taux_remuneration;
	}
	public CompteEpargne() {
		super();
	}

	
	
	

}
