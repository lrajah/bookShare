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
public interface EmprunteurInterface {
	public Users cotisation();
	public Users bookBorrowing(Loueur loueur,Livre livre);
	public Users returnBook(Loueur loueur, Livre livre);
	public Users emprunteurToLoueur(Users emprunteur);
	public Users emprunteurToEmprunteurLoueur(Users emprunteur);
}
