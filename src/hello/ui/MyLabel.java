/**
 * 
 */
package hello.ui;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;

import hello.livre.Author;

/**
 * @author Dell
 *
 */
public class MyLabel extends JLabel {
	
	public void addLabel(JFrame mainWindow,String label) {
		this.setText(label);
		mainWindow.add(this);
	}
	
	public void printAuthor(JFrame mainWindow, ArrayList<Author> auteurs) {
		
		for(int i =0 ;i<auteurs.size();i++) {
			this.addLabel(mainWindow,auteurs.get(i).nom());
			
		}
	}
	
}
