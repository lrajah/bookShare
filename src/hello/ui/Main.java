/**
 * 
 */
package hello.ui;

import java.awt.Button;
import java.awt.Color;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

import hello.livre.Author;
import hello.livre.exceptions.PersonalException;
import hello.tools.AuthorImport;
import hello.tools.ToArray;

/**
 * @author Dell
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ParseException 
	 * @throws PersonalException 
	 */
	public static void main(String[] args) throws PersonalException, ParseException, IOException {
		// TODO Auto-generated method stub
		JFrame mainWindow=new MainApp();
		MyButton b1= new MyButton();
		b1.setButtonCaption("Hello");
		
		((MainApp) mainWindow).addB(b1);
		((MainApp) mainWindow).changeBackgroundColor(Color.DARK_GRAY);
		
		MyLabel label=new MyLabel();
		
		AuthorImport auteur=new AuthorImport();
//		System.out.println(auteur.getAuthor().size());
		
		//System.out.println(Author.getAuthor(auteur.getAuthor()));
//		label.printAuthor(mainWindow, Author.getAuthor(auteur.getAuthor()));
//		((MainApp) mainWindow).add(label);
		
		// Je récupère la liste des auteurs
		
		ArrayList<Author> lesAuteurs = Author.getAuthor(auteur.getAuthor());
				
		MyList auteurListe = new MyList(ToArray.toArray(lesAuteurs));
		((MainApp) mainWindow).addListe(auteurListe);
		
		mainWindow.setVisible(true);
	}
	
	
}
