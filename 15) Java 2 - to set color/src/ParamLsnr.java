import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ParamLsnr extends JFrame {

	ParamLsnr(){
		
		setLayout(new GridLayout(4,1));
		
		add( getMyPanel());
		add( getMyPanel());
		add( getMyPanel());
		add( getMyPanel());
			
		
		setVisible(true);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	JPanel getMyPanel(){
		JTextField tf = new JTextField(10);
		JButton btn = new JButton("Set Color");
		JPanel retVal = new JPanel(new FlowLayout());
		retVal.add(tf);
		retVal.add(btn);
		
		btn.addActionListener(new MyListener(tf,retVal));
		
		return retVal;
		
		
		
	}
	
	
	public static void main(String[] args) {
		
new ParamLsnr();
	}

}
