/**
 * 
 */
package hello.livre;

import hello.Users;


/**
 * @author Dell
 *
 */
public class Loueur extends Users {

	/**
	 * 
	 */
	private int nbLivre;
	private Cotisation cotisation;
	public Loueur() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param numAd
	 */
	public Loueur(String nom, String prenom, String numAd) {
		super(nom, prenom, numAd);
		// TODO Auto-generated constructor stub
	}

	public int nbLivre() {
		return nbLivre;
	}

	public Loueur nbLivre(int nbLivre) {
		this.nbLivre = nbLivre;
		return this;
	}

	public Double cotisation() {
		Double cot;
		//
		cot=this.cotisation.coutHT();
		System.out.println(cot);
		if(this.nbLivre>this.cotisation.nbLivreMin()) {
			cot-=0.01*this.cotisation.remise()*cot;
		}
		cot*=(1+0.01*this.cotisation.tva());
		return cot;
	}
	public Double cotisationHT() {
		Double cot;
		//
		cot=this.cotisation.coutHT();
		System.out.println(cot);
		if(this.nbLivre>this.cotisation.nbLivreMin()) {
			cot-=0.01*this.cotisation.remise()*cot;
		}
		return cot;
	}


	public void cotisation(Cotisation cotisation) {
		this.cotisation = cotisation;
	}
	

	
	

}
