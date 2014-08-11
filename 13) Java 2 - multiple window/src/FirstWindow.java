import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class FirstWindow extends JFrame {
	
	
	JTextArea ta1 = new JTextArea(10,20);
	JTextArea ta2 = new JTextArea(10,20);
	JButton btn = new JButton("open new window");
	
	
	
	
	FirstWindow(){
		
		setLayout(new GridLayout(1,3));
		
		add( getTextArea(ta1));
		add( getTextArea(ta2));
		add( getButtonPanel(btn));
		
		btn.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new SecondWindow(ta1,ta2);
				
			}
		});
			
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		pack();
		
	}
	
	
	JPanel getTextArea(JTextArea pTA){
		JPanel ret= new JPanel(new FlowLayout());
		
		JScrollPane sp = new JScrollPane(pTA);
		ret.add(sp);
		return ret;
		
	}
	
	
	JPanel getButtonPanel(JButton pBtn){
		
		JPanel ret = new JPanel(new FlowLayout());

		ret.add(btn);
		return ret;
	}
	
	
	
	
	public static void main (String args[]){
	 new FirstWindow();
	}

}
