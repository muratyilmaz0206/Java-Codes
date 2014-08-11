import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;


public class first extends JFrame {
	
	JTextArea ta = new JTextArea(30,30);
	
	
	first(){
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		add(ta);
		
		new second(ta);
		
		pack();
	}
	
	public static void main(String[] args) {
		new first();
	}

}
