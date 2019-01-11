/**
 * 
 */
package hello.users;

import java.text.ParseException;
import java.io.*;
import hello.livre.Author;
import hello.livre.Livre;
import hello.livre.exceptions.PersonalException;
import hello.tools.AuthorImport;

/**
 * @author Dell
 *
 */
public class CreateUsers {

	/**
	 * @param args
	 * @throws ParseException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws ParseException,PersonalException, IOException {
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
		
		((Loueur)loueur).addBook(livre1,2);
		((Loueur)loueur).addBook(livre2,3);
		
		System.out.println(((Loueur)loueur).nBlivres());
		
		System.out.println(((Loueur)loueur).listLivres());
	    
		
		((Loueur)loueur).addBook(livre1, 1);
		System.out.println(((Loueur)loueur).listLivres());
		
		((Loueur) loueur).loan(livre1, 5);
		System.out.println(((Loueur)loueur).listLivres());
		
		// Création d'auteur
		
//		try {
//			Author asimov= Author.getAuthor();
//			System.out.println("Auteur: " + asimov.nom());
//		}catch(ParseException e) {
//			System.out.println("La date de naissance de est incorecte");
//			System.out.println(e.getMessage());
//		}catch(PersonalException naissance) {
//			System.out.println(naissance.getMessage());
//		}
		
		AuthorImport auteur=new AuthorImport();
//		System.out.println(auteur.getAuthor().size());
		
		System.out.println(Author.getAuthor(auteur.getAuthor()).size());
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
