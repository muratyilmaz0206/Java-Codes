import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class GUITest extends JFrame {
	
	GUITest(){
		
		setLayout( new FlowLayout() );
		
		JLabel lbl = new JLabel("name : ");
		JTextField tfname = new JTextField (10);
		
		JLabel lbl2 = new JLabel("age : ");
		JTextField tfage = new JTextField(10);
		
		String[] st = {"Female", "Male"};
		
		JComboBox<String> cb = new JComboBox<>(st);
		
		add(lbl);
		add(tfname);
		
		add(lbl2);
		add(tfage);
		
		add(cb);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		pack();
		
		
			
		
	}

	public static void main(String[] args) {
			
		new GUITest();
			
		}
		
	}


