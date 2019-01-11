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
	private Cotisation cotisation;
	private boolean assStock;
	private int collectionSize;
	public Loueur() {
		this.livres = new HashMap<Livre, Integer>();
	}
	
	interface GetSize{
		public int getSize (HashMap<Livre,Integer> books, boolean getStock);
	}
	@Override
	public Users addBook(Livre livre, Integer nbLivre) {
		// TODO Auto-generated method stub
		
		if(!this.livres.containsKey(livre)) {
			this.livres.put(livre, nbLivre);
		}
		else {
			nbLivre+= this.livres.get(livre);
			System.out.println(nbLivre);
			this.livres.replace(livre, nbLivre);
			
		}
		
		return this;
		
	}
	public String nBlivres() {
		String message = "Nombre de livres: ";
		message+=this.livres.size();
		return message;
	}
	public int getCollectionSize(boolean asStock) {
		this.assStock=asStock;
		
		GetSize size =(books, getStock) -> {
			if(!(getStock)) {
				return books.size();
			}
			else {
				int stock =0;
				for(Livre livre : books.keySet()) {
					stock+=books.get(livre);
				}
				return stock;
			}
		};
		return size.getSize(this.livres, this.assStock);
		
	}
	public String listLivres(){
		
		String message="Livres de la collection de " + this.nom + "\n";
		for(Map.Entry<Livre,Integer> livre : this.livres.entrySet()) {
			message+=livre.getKey().titre() + " & Nombre: " + livre.getValue()+"\n";
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
