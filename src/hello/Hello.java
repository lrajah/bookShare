/**
 * 
 */
package hello;
import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.Date;
import hello.livre.Author;
import hello.livre.Cotisation;
import hello.livre.Emprunteur;
import hello.livre.Livre;
import hello.livre.Loueur;

/**
 * @author Dell
 *
 */
public class Hello {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		System.out.println("Hello Java");
		
		
		Loueur unUser = new Loueur();
		unUser.nom("Aubert");
		unUser.prenom("Jean-Luc");
		unUser.numAd("5722");
		
		System.out.println("Utilisateur: " + unUser.nom());
		
		Loueur unUser2 = new Loueur("Jean","Jack","5896");
		System.out.println("Utilisateur: " + unUser2.nom());
		
		Users alien = new Loueur();
		Cotisation cot= new Cotisation();
		alien
			.nom("ET")
			.prenom("Maison")
			.numAd("8596");
			((Loueur) alien).nbLivre(65);
			((Loueur) alien).cotisation(cot);
			
		System.out.println("Utilisateur: " + alien.nom() +", La cotisation est: "+((Loueur)alien).cotisationHT());
			
		
		//Création Emprunteur
		Users alien2 = new Emprunteur();
		//Cotisation cot2= new Cotisation();
		alien2
			.nom("ET2")
			.prenom("Maison2")
			.numAd("8598");
			((Emprunteur) alien2).nbLivre(785);
			((Emprunteur) alien2).cout(null);
		System.out.println("Utilisateur: " + alien2.nom() +", La cout est: "+((Emprunteur)alien2).cout());
			
		
		
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
		 String sDate1="31/12/1020";  
	     Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
		
		Author auteur1=Author.getAuthor("Hugo","Victor", date1);
		livre1.auteur(auteur1);
		
		if(auteur1==null) {
			System.out.println("La date de naissance de l'auteur est incorrect");
		}
		else System.out.println("Auteur: " + auteur1.nom());
		
		
	}

}
