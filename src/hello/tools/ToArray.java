/**
 * 
 */
package hello.tools;

import java.util.ArrayList;

import hello.livre.Author;

/**
 * @author Dell
 *
 */
public class ToArray {
	
	
	public static String[] toArray(ArrayList<Author> auteur) {
		
		String[] toString=new String[auteur.size()];
		
		for (int i = 0; i < toString.length; i++) {
			toString[i] = auteur.get(i).nom() + " " + auteur.get(i).prenom();
		}
		
		return toString;
		
	}

}
