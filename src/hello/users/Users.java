/**
 * 
 */
package hello.users;

/**
 * @author Dell
 *
 */
abstract public class Users {
	protected String nom;
	protected String prenom;
	protected String numAd;
	
	public Users nom(String nom) {
		this.nom=nom;
		return this;
	}
	
	public String nom() {
		return this.nom;
	}
	public Users prenom(String prenom) {
		this.prenom=prenom;
		return this;
	}
	public String prenom() {
		return this.prenom;
	}
	public Users numAd(String numAd) {
		this.numAd=numAd;
		return this;
	}
	public String numAd() {
		return this.numAd;
	}
}
