/**
 * 
 */
package hello.livre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import hello.livre.exceptions.PersonalException;

/**
 * @author Dell
 *
 */
public class Author {
	
	private String nom;
	private String prenom;
	private Date date;
	public String nom() {
		return nom;
	}
	public Author nom(String nom) {
		this.nom = nom;
		return this;
	}
	public String prenom() {
		return prenom;
	}
	public Author prenom(String prenom) {
		this.prenom = prenom;
		return this;
	}
	public Date date() {
		return date;
	}
	public Author date(Date date) {
		this.date = date;
		return this;
	}
	
	 private Author(String nom, String prenom, Date date ) {
		this.nom=nom;
		this.prenom=prenom;
		this.date=date;
		
	}
	
	public static Author getAuthor(String nom, String prenom, Date date ) throws PersonalException {
		Date dateNow = new Date();
		if(date.compareTo(dateNow) > 0) {
			throw new PersonalException();
		}
		
		Author auteur=new Author(nom, prenom, date);
		return auteur;
		}
	
	public static Author getAuthor() throws ParseException,PersonalException {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Nom de l'auteur: ");
		String nom = scanner.nextLine();
		scanner.reset();
		
		System.out.println("Prenom de l'auteur: ");
		String prenom = scanner.nextLine();
		scanner.reset();
		
		System.out.println("Date de naissance de l'auteur (\"dd/MM/yyyy\"): ");
		String dateNaissance = scanner.nextLine();
		scanner.reset();
		SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
		format.setLenient(false);
		Date date1=format.parse(dateNaissance);
		//((SimpleDateFormat) date1).setLenient(false);
		
		scanner.close();
		
		return getAuthor(nom,prenom,date1);
		
		
	}
	
	public static ArrayList<Author> getAuthor(ArrayList<String[]> array) throws PersonalException, ParseException {
		String nom;
		String prenom;
		String date;
		ArrayList<Author> auteurs=new ArrayList<Author>();
		for(int i=0;i<array.size();i++) {
			nom=array.get(i)[0];
			prenom=array.get(i)[1];
			date=array.get(i)[2];
			SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
			format.setLenient(false);
			Date date1=format.parse(date);
			auteurs.add(getAuthor(nom,prenom,date1));
		}
		return auteurs;
		
	}
	
}
