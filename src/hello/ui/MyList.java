/**
 * 
 */
package hello.ui;

import javax.swing.JList;

import hello.livre.Author;


/**
 * @author jean-
 *
 */
public class MyList extends JList<String> {
	
	public MyList(String[] auteurs) {
		this.setListData(auteurs);
	}
}