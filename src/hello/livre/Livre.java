/**
 * 
 */
package hello.livre;

import java.util.Date;

/**
 * @author Dell
 *
 */
public class Livre {
	
	private static final int NULL = 0;
	private String titre;
	private String resume;
	private int nbPages;
	private Author auteur;
	
	private final int LIM=4;
	public String titre() {
		return this.titre;
	}
	public Livre titre(String titre) {
		this.titre = titre;
		return this;
	}
	public String resume() {
		return this.resume;
	}
	public Livre resume(String resume) {
		this.resume = resume;
		return this;

	}
	public int nbPages() {
		
		if(this.nbPages == NULL)
		{
			this.nbPages = LIM;
			return this.nbPages;
		}
		return this.nbPages;
	}
	
	public Livre nbPages(int nbPages) {
		
		if(nbPages>LIM) {
			this.nbPages = nbPages;
			return this;
		}
		else {
			this.nbPages = LIM;
			return this;
		}
	}
	public Author auteur() {
		return auteur;
	}
	public Livre auteur(Author auteur) {
		this.auteur = auteur;
		return this;
	}
	
	

	
	
	

}
