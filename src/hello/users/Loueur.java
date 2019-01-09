/**
 * 
 */
package hello.users;

import java.util.ArrayList;

import hello.livre.Cotisation;
import hello.livre.Livre;
import hello.users.interfaces.LoueurInterface;
import hello.users.Users;
/**
 * @author Dell
 *
 */
public class Loueur extends Users implements LoueurInterface {
	ArrayList<Livre> livres;
	ArrayList<Integer> nbLivre;  
	private Cotisation cotisation;
	
	public Loueur() {
		this.livres = new ArrayList<Livre>();
	}
	@Override
	public Users addBook(Livre livre) {
		// TODO Auto-generated method stub
		
		int indice= 0;
		indice=this.livres.size();
		if(!this.livres.contains(livre)) {
			this.livres.add(livre);
		}
		
		return this;
		
	}
	public String nBlivres() {
		String message = "Nombre de livres: ";
		message+=this.livres.size();
		return message;
	}
	
	public String listLivres(){
		
		String message="Livres de la collection de " + this.nom + "\n";
		for(Livre i : this.livres) {
			message+=i.titre() + "\n";
		}
		return message;
	}
	@Override
	public Users loan(Livre livre) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Users calculeCotisation() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Users loueurToEmprunteur(Users loueur) {
		// TODO Auto-generated method stub
		Users emprunteur= new Emprunteur();
		emprunteur
				.nom(loueur.nom())
				.prenom(loueur.prenom())
				.numAd(loueur.numAd());
		loueur=null;
		
		return emprunteur;
	}

	@Override
	public Users loueurToEmprunteurLoueur(Users loueur) {
		// TODO Auto-generated method stub
		Users emprunteurLoueur= new EmprunteurLoueur();
		emprunteurLoueur
				.nom(loueur.nom())
				.prenom(loueur.prenom())
				.numAd(loueur.numAd());
		loueur=null;
		
		return emprunteurLoueur;
	}
}
