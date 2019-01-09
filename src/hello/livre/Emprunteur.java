/**
 * 
 */
package hello.livre;

import hello.Users;

/**
 * @author Dell
 *
 */
public class Emprunteur extends Users {

	/**
	 * 
	 */
	
	private int nbLivre;
	private Double cout;
	private int jour=5;
	public Emprunteur() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param numAd
	 */
	public Emprunteur(String nom, String prenom, String numAd) {
		super(nom, prenom, numAd);
		// TODO Auto-generated constructor stub
	}

	public int nbLivre() {
		return nbLivre;
	}

	public Emprunteur nbLivre(int nbLivre) {
		this.nbLivre = nbLivre;
		return this;
	}

	public Double cout() {
		return cout;
	}

	public Emprunteur cout(Double cout) {
		this.cout = Cotisation.coutEmp*this.jour*this.nbLivre;
		//System.out.println(Cotisation.coutEmp*this.jour);
		return this;
	}
	

}
