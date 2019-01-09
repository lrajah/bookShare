/**
 * 
 */
package hello.users.interfaces;

import hello.livre.Livre;
import hello.users.Loueur;
import hello.users.Users;

/**
 * @author Dell
 *
 */
public interface LoueurInterface {
	public Users addBook(Livre livre, Integer nbLivre);
	public Users loan(Livre livre, int nbLivre);
	public Users calculeCotisation();
	public Users loueurToEmprunteur(Users loueur);
	public Users loueurToEmprunteurLoueur(Users loueur);

}
