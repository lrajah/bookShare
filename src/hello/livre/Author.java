/**
 * 
 */
package hello.livre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

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
	
	public static Author getAuthor(String nom, String prenom, Date date ) {
		Date dateNow = new Date();
		if(date.compareTo(dateNow) > 0) {
			return null;
		}
		
		Author auteur=new Author(nom, prenom, date);
		return auteur;
		}
	
	public static Author getAuthor() throws ParseException {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Nom de l'auteur: ");
		String nom = scanner.nextLine();
		scanner.nextLine();
		
		System.out.println("Prenom de l'auteur: ");
		String prenom = scanner.nextLine();
		scanner.nextLine();
		
		System.out.println("Date de naissance de l'auteur (\"dd/MM/yyyy\"): ");
		String dateNaissance = scanner.nextLine();
		scanner.nextLine();
		Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(dateNaissance);
		
		return getAuthor(nom,prenom,date1);
		
		
	}
	
}
