/**
 * 
 */
package hello.users;
import hello.users.Users;
import hello.livre.Livre;
import hello.users.interfaces.EmprunteurInterface;
import hello.users.interfaces.LoueurInterface;

/**
 * @author Dell
 *
 */
public class EmprunteurLoueur extends Users implements LoueurInterface, EmprunteurInterface {

	/**
	 * 
	 */
	public EmprunteurLoueur() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Users addBook(Livre livre, Integer nbLivre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users loan(Livre livre, int Livre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users calculeCotisation() {
		// TODO Auto-generated method stub
		return null;
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
	public Users loueurToEmprunteur(Users loueur) {
		// TODO Auto-generated method stub
		
		
		return loueur;
	}

	@Override
	public Users loueurToEmprunteurLoueur(Users loueur) {
		// TODO Auto-generated method stub
		
		return loueur;
	}

	@Override
	public Users emprunteurToLoueur(Users emprunteur) {
		// TODO Auto-generated method stub
		return emprunteur;
	}

	@Override
	public Users emprunteurToEmprunteurLoueur(Users emprunteur) {
		// TODO Auto-generated method stub
		return emprunteur;
	}
	
	public Users emprunteurLoueurToLoueur(Users emprunteurLoueur) {
		Users loueur= new Loueur();
		loueur
				.nom(emprunteurLoueur.nom())
				.prenom(emprunteurLoueur.prenom())
				.numAd(emprunteurLoueur.numAd());
		emprunteurLoueur=null;
		
		return loueur;
	}
	public Users emprunteurLoueurToEmprunteur(Users emprunteurLoueur) {
		Users emprunteur= new Emprunteur();
		emprunteur
				.nom(emprunteurLoueur.nom())
				.prenom(emprunteurLoueur.prenom())
				.numAd(emprunteurLoueur.numAd());
		emprunteurLoueur=null;
		
		return emprunteur;
	}
	

}
