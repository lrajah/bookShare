/**
 * 
 */
package hello.tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author Dell
 *
 */
public class AuthorImport {
	
	private static File authorFile;
	private static final String FIELD_SEP = ";";
	private static ArrayList<String[]> auteurs;
	public AuthorImport() {
		
		this.authorFile=new File("Author.txt");
		this.auteurs= new ArrayList<String[]>();
	}
	
	
	private static void readAndCreateArray() throws IOException {
		String data;
		Scanner in = new Scanner(AuthorImport.authorFile);
//		in.useDelimiter(FIELD_SEP);
		String nom;
		String prenom;
		String date;
		in.nextLine();
		while(in.hasNext()) {
			nom=in.nextLine();
			String[] cols =nom.split(FIELD_SEP);
			AuthorImport.auteurs.add(cols);
//			prenom=in.next();
//			date=in.next();
//			in.nextLine();
			
//			String message=new String();
//			for(int i =0; i<cols.length;i++) {
//				message+=cols[i] + " ";
//	
//			}
//			message+="\n";
//			System.out.println(message);
	
		}

		
	}
	public ArrayList<String[]> getAuthor() throws IOException{
		
		AuthorImport.readAndCreateArray();
//		System.out.println(auteurs.size());
		return auteurs;
		
	}
	

	
}
