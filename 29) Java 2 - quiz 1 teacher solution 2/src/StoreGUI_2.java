import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.xml.bind.ParseConversionEvent;


public class StoreGUI_2 extends JFrame{
	
	HashMap<String, FruitDetail> hashmap1 = new HashMap<String, FruitDetail>();
	
	
	JPanel pan1 = new JPanel();
	JPanel pan2 = new JPanel();
	JLabel lbl1 = new JLabel("Fruit Name");
	JLabel lbl2 = new JLabel("Price");
	JLabel lbl3 = new JLabel("Origin");
	
	JTextField tf1 = new JTextField(10);
	JTextField tf2 = new JTextField(10);
	JTextField tf3 = new JTextField(10);
	
	
	
	 StoreGUI_2() {
		
		 
		 JButton addbtn= new JButton("Add");
			addbtn.addActionListener(new ActionListener() {
				
				
				
				public void actionPerformed(ActionEvent arg0) {
					
					String key1 = tf1.getText();
					FruitDetail fd = new FruitDetail(tf3.getText(), tf2.getText());
					String data = tf2.getText() + ";" + tf3.getText();
					hashmap1.put(key1, fd);
					tf1.setText("");
					tf2.setText("");
					tf3.setText("");
					
					
					
					
					
				}
			});
			JButton findbtn = new JButton("Find");
			findbtn.addActionListener(new ActionListener() {
				
				
				public void actionPerformed(ActionEvent e) {
					
					Set set = hashmap1.entrySet();
					Iterator i = set.iterator();
					
					while( i.hasNext() ){
						Map.Entry me = (Map.Entry)(i.next());
						String key = me.getKey().toString();
						FruitDetail data = (FruitDetail)me.getValue();
						String origin = data.origin;
						String price = data.price;
					
						
						if(tf1.getText().equals(key)){
				tf2.setText(price);
				tf3.setText(origin);
			}
					}
					 
					
					
					
				}
			});
		 setLayout(new GridLayout(1,2));
		 pan1.add(lbl1);
		 pan1.add(tf1);
		 pan2.add(addbtn);
		 pan1.add(lbl2);
		 pan1.add(tf2);
		 pan2.add(findbtn);
		 pan1.add(lbl3);
		 pan1.add(tf3);
		 add(pan1);
		 add(pan2);
		 
		 pack();
		 setSize(390,200);
		 setVisible(true);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
	 }
		
	
	public static void main(String[] args) {
		new StoreGUI_2();
		

	}

	
}
