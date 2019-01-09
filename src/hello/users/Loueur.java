/**
 * 
 */
package hello.users;

import java.util.ArrayList;
import java.util.HashMap;

import hello.livre.Cotisation;
import hello.livre.Livre;
import hello.users.interfaces.LoueurInterface;
import hello.users.Users;
/**
 * @author Dell
 *
 */
public class Loueur extends Users implements LoueurInterface {
	HashMap<Livre,Integer> livres;
	ArrayList<Integer> nbLivre;  
	private Cotisation cotisation;
	
	public Loueur() {
		this.livres = new HashMap<Livre, Integer>();
		this.nbLivre = new ArrayList<Integer>();
	}
	@Override
	public Users addBook(Livre livre, Integer nbLivre) {
		// TODO Auto-generated method stub
		
		int indice= 0;
		
		indice=this.livres.size();
		if(!this.livres.containsValue(livre)) {
			this.livres.put(livre, nbLivre);
			this.nbLivre.add(nbLivre);
		}
		else {
			indice= this.livres.indexOf(livre);
			//System.out.println(this.nbLivre.get(indice));
			nbLivre+= this.nbLivre.get(indice);
			//System.out.println(nbLivre);
			this.nbLivre.add(indice, nbLivre);;
			
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
		for(int i=0 ; i< this.livres.size();i++) {
			message+=this.livres.get(i).titre() + " Nombre:  " + this.nbLivre.get(i) +"\n";
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
