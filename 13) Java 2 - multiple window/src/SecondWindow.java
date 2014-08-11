import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class SecondWindow extends JFrame implements ActionListener{
	
	String[] list = {"First" , "Second"};
	JComboBox<String> cmb = new JComboBox<String>(list); 
	JTextField tf = new JTextField(10);
	JButton btn = new JButton("add");
	JTextArea myTA1, myTA2;
	
	
	
	SecondWindow(JTextArea pTa1, JTextArea pTa2){
		myTA1 = pTa1;
		myTA2 = pTa2;
		
		setLayout(new FlowLayout());
		
		add(cmb);
		add(tf);
		add(btn);
		btn.addActionListener(this);
		
		
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent e){
		
		if(cmb.getSelectedIndex() == 0){
			myTA1.append( tf.getText() + "\n");
		} else {
			myTA2.append(tf.getText() + "\n");
		}
			
		
	}
}
