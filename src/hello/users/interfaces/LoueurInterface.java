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
	public Users addBook(Livre livre);
	public Users loan(Livre livre);
	public Users calculeCotisation();
	public Users loueurToEmprunteur(Users loueur);
	public Users loueurToEmprunteurLoueur(Users loueur);

}