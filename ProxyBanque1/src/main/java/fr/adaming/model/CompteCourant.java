package fr.adaming.model;

public class CompteCourant extends Compte {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double decouvertAutorise;
	
	
	// Constructeurs

	/**
	 * @param decouvertAutorise
	 */
	public CompteCourant(double decouvertAutorise) {
		super();
		this.decouvertAutorise = decouvertAutorise;
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
