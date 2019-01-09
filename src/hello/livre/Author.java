/**
 * 
 */
package hello.livre;

import java.util.Date;

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
	
}
