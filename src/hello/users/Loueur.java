/**
 * 
 */
package hello.users;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
		if(!this.livres.containsKey(livre)) {
			this.livres.put(livre, nbLivre);
			this.nbLivre.add(nbLivre);
		}
		else {
			//System.out.println(this.nbLivre.get(indice));
			nbLivre+= this.livres.get(livre);
			System.out.println(nbLivre);
			this.livres.replace(livre, nbLivre);
			//this.nbLivre.add(indice, nbLivre);
			
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
		for(Map.Entry<Livre,Integer> me : this.livres.entrySet()) {
			message+=me.getKey().titre() + " & Nombre: " + me.getValue()+"\n";
		}
		return message;
	}
	@Override
	public Users loan(Livre livre, int nbLivre) {
		// TODO Auto-generated method stub
		if(this.livres.containsKey(livre)==true && this.livres.get(livre)>=nbLivre) {
			int oldValue=this.livres.get(livre);
			oldValue-=nbLivre;
			this.livres.replace(livre, oldValue);
		}
		
		return this;
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
