import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class AddCombo extends JFrame{

	JTextField tf = new JTextField(10);
	JButton add = new JButton("add");
	JComboBox cb = new JComboBox();
	JButton clr = new JButton("clear");
	
	AddCombo(){
		setLayout( new FlowLayout());
		add(tf);
		add(add); add.addActionListener( new addLsnr());
		add(cb);
		clr.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				cb.removeAllItems();
				
			}
		});
		add(clr); 
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	 
	public static void main(String[] args) {
		new AddCombo();

	}
	
	public class addLsnr implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			cb.addItem( tf.getText() );
		}
		
	}

}