/**
 * 
 */
package hello.users;

import hello.livre.Livre;

/**
 * @author Dell
 *
 */
public class CreateUsers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Users loueur= CreateUsers.createLoueur();
		Users emprunteur= CreateUsers.createEmprunteur();
	    Users emprunteurLoueur= CreateUsers.createEmprunteurLoueur();
	    if(loueur instanceof Loueur) {
			System.out.println( loueur.nom() + " est un loueur");
		}
	    //loueur=((Loueur) loueur).loueurToEmprunteur(loueur);
	    //loueur=((Loueur) loueur).loueurToEmprunteurLoueur(EmprunteurLoueur);
	    if(emprunteurLoueur instanceof EmprunteurLoueur) {
			System.out.println( loueur.nom() + " est un Emprunteur et Loueur à la fois");
		}
	    
	    emprunteurLoueur=((EmprunteurLoueur) emprunteurLoueur).emprunteurLoueurToLoueur(emprunteurLoueur);
	    if(emprunteurLoueur instanceof Loueur) {
			System.out.println( emprunteurLoueur.nom() + " est un Loueur");
		}
	    
	    
	    
		//Création de livres
		
		Livre livre1 = new Livre();
		livre1
			.titre("Les Misérables")
			.resume("Bla BLa BLa bLA")
			.nbPages(233);
		
		System.out.println("Livre: " + livre1.titre());
		
		Livre livre2 = new Livre();
		livre2
			.titre("Fondation")
			.resume("Bla BLa BLa BLALALAL bLA")
			.nbPages(3);
		
		System.out.println("Livre: " + livre2.nbPages());
		
		((Loueur)loueur).addBook(livre1);
		((Loueur)loueur).addBook(livre2);
		
		System.out.println(((Loueur)loueur).nBlivres());
		
		System.out.println(((Loueur)loueur).listLivres());
	    
	}
	
	
	private static Users createLoueur() {
		return new Loueur()
					.nom("Aubert")
					.prenom("JL")
					.numAd("021545485");
		
	}
	private static Users createEmprunteur() {
		return new Emprunteur()
				.nom("Talaron")
				.prenom("JL2")
				.numAd("021545486");
	}
	private static Users createEmprunteurLoueur() {
		return new EmprunteurLoueur()
				.nom("Aulas")
				.prenom("Vamoi")
				.numAd("021545487");
	}

}
