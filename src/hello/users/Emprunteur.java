/**
 * 
 */
package hello.users;

import hello.livre.Livre;
import hello.users.interfaces.EmprunteurInterface;

/**
 * @author Dell
 *
 */
public class Emprunteur extends Users implements EmprunteurInterface {

	/**
	 * 
	 */
	public Emprunteur() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Users cotisation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users bookBorrowing(Loueur loueur, Livre livre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users returnBook(Loueur loueur, Livre livre) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Users emprunteurToLoueur(Users emprunteur) {
		// TODO Auto-generated method stub
		Users loueur= new Loueur();
		loueur
				.nom(emprunteur.nom())
				.prenom(emprunteur.prenom())
				.numAd(emprunteur.numAd());
		emprunteur=null;
		
		return loueur;
	}

	@Override
	public Users emprunteurToEmprunteurLoueur(Users emprunteur) {
		// TODO Auto-generated method stub
		Users emprunteurLoueur= new EmprunteurLoueur();
		emprunteurLoueur
				.nom(emprunteur.nom())
				.prenom(emprunteur.prenom())
				.numAd(emprunteur.numAd());
		emprunteur=null;
		
		return emprunteurLoueur;
	}

}
