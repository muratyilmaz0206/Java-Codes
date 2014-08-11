import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class second extends JFrame  implements ActionListener{

	JTextField field = new JTextField(10);
	
	JButton button = new JButton("append");
	
	JTextArea myTA1;
	
	second(JTextArea pTA1){
		myTA1 = pTA1;
		
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		add(field);
		add(button);
		
		button.addActionListener(this);
		
		pack();
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {

if(e.getSource()==button){
	myTA1.append(field.getText() + "\n");
}
		
	}
	
}
