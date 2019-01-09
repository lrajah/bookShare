/**
 * 
 */
package hello;

import hello.livre.Cotisation;
import hello.livre.Loueur;

/**
 * @author Dell
 *
 */
abstract public class Users {
	protected String nom;
	protected String prenom;
	protected String numAd;
	
	/**
	 * Constructor d'une classe Java 
	 * Porte le nom de la classe
	 */
	public Users() {
		System.out.println("Je suis le constructor Users");
	}
	
	public Users(String nom, String prenom, String numAd) {
		this.nom=nom;
		this.prenom=prenom;
		this.numAd=numAd;
	}
	
	public final String nom() {
		return nom;
	}
	public final  Users nom(String nom) {
		this.nom = nom;
		return this;
	}
	public final String prenom() {
		return prenom;
	}
	public final Users prenom(String prenom) {
		this.prenom = prenom;
		return this;
	}
	public final String numAd() {
		return numAd;
	}
	public final Users numAd(String numAd) {
		this.numAd = numAd;
		return this;
	}

	//protected abstract Loueur nbLivre(int i);
	//protected abstract void cotisation(Cotisation cotisation);
	//protected abstract  Double cotisationHT();

}
