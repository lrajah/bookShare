/**
 * 
 */
package hello.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * @author Dell
 *
 */
public class MyButton extends JButton implements ActionListener {
	private int width;
	private int  height;
	
	public MyButton() {
		this.addActionListener(this);
	}
	public void setButtonCaption(String caption) {
		this.setText(caption);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		this.setText("Et Voila");
		this.setEnabled(false);
	}
	
	
	

}
