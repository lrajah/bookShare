/**
 * 
 */
package hello.livre;

/**
 * @author Dell
 *
 */
public class Cotisation {
	private final Double coutHT=15.;
	private final Double remise=5.;
	private final Double tva=20.;
	private final int nbLivreMin=30;
	public Double coutHT() {
		return coutHT;
	}
	public Double remise() {
		return remise;
	}
	public Double tva() {
		return tva;
	}
	public int nbLivreMin() {
		return nbLivreMin;
	}
	public static final Double coutEmp=0.05;
	
	

}
