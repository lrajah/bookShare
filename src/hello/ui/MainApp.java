/**
 * 
 */
package hello.ui;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
/**
 * @author Dell
 *
 */
public class MainApp extends JFrame {
	public MainApp() {
		this.setTitle("Mon application");
		this.setSize(800,600);
		this.getContentPane().setLayout(new FlowLayout());
	}
	public void changeBackgroundColor(Color bgColor) {
	this.setBackground(bgColor);
	}
	
	public void addB(MyButton button) {
		this.add(button);
		
	   
	}
	
	public void addListe(JList<String> list) {
		this.add(list);
	}
	
}
