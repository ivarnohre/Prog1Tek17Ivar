package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 * Shows how swing works
 * @author ivar.nohre
 *
 */
public class Main extends JFrame {
	/**
	 * Representing text in the program
	 */
	JLabel text;
	/**
	 * 
	 */
	private Toolkit toolkit = Toolkit.getDefaultToolkit();
	
	public Main() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(400, 500);
		this.setVisible(true);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(null);
		contentPane.setBackground(Color.BLACK);
		addButtons(contentPane);
	}
	/**
	 * 
	 * @param contentPane
	 */
	public void addButtons(Container contentPane) {
		Color cyanColor = new Color(0, 255, 255);
		
		JButton closeButton = new JButton("Close");
		closeButton.setBounds(75, 50, 100, 50);
		closeButton.setBackground(cyanColor);
		closeButton.setForeground(Color.BLACK);
		closeButton.addActionListener(event -> buttonPressed());
		contentPane.add(closeButton);
		text = new JLabel("Hello world");
		text.setBounds(75, 250, 100, 50);
		text.setForeground(cyanColor);
		contentPane.add(text);
		
		/**
		 * 
		 */
		JButton changeTextButton = new JButton("Change text on label");
		changeTextButton.setBounds(25, 150, 200, 50);
		changeTextButton.setBackground(cyanColor);
		changeTextButton.setForeground(Color.BLACK);
		changeTextButton.addActionListener(event -> changeTxt());
		contentPane.add(changeTextButton);
		
	}
	/**
	 * 
	 */
	public void changeTxt() {
		text.setText("Bye world!");
	}
	/**
	 * 
	 */
	public void buttonPressed() {
		System.exit(0);
	}
    
	public static void main(String[] args) {
		Main frame = new Main();
		
          
		
	}

}
