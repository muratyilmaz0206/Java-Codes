import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class HashMapGUIDemo extends JFrame{

	HashMap< String, Float > hm = new HashMap< String, Float >();
	
	
	
	
	HashMapGUIDemo(){
		
		this.setLayout(new GridLayout(2,1));
		this.add(getPan1());
		this.add(getPan2());
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
	}
	
	
	JPanel getPan1(){
		final JTextField tf1 = new JTextField(10);
		final JTextField tf2 = new JTextField(10);
		
		JButton btn = new JButton(" Add to Hassmap");
		
		JPanel retVal = new JPanel(new FlowLayout());
		retVal.add(tf1);
		retVal.add(tf2);
		retVal.add(btn);
		
	btn.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent arg0){
				String key = tf1.getText();
				Float value = Float.parseFloat(tf2.getText());
				
				
				if(hm.containsKey(key)){
					JOptionPane.showMessageDialog(null, "key exists!");
				}
				
				else {
				hm.put(key, value);
				JOptionPane.showMessageDialog(null, "number of items in HM :" + hm.size());
				}
			}
		});
		
		return retVal;
		
		
	
	}
	
	JPanel getPan2(){
		final JTextField tf1 = new JTextField(10);
		final JTextField tf2 = new JTextField(10);
		
		JButton btn = new JButton(" Show value");
		
		JPanel retVal = new JPanel(new FlowLayout());
		retVal.add(tf1);
		retVal.add(tf2);
		retVal.add(btn);
		
		
btn.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent arg0){
				String search_key = tf1.getText();
				Float value = hm.get(search_key);
						tf2.setText(value.toString());
				
			}
		});
		
		
		
		
		return retVal;
	}
	
	
	public static void main(String[] args){

		new HashMapGUIDemo();
	}
}
