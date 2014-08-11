import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class test extends JFrame implements ActionListener{

	
	JLabel label1 = new JLabel("keyword");
	JLabel label2 = new JLabel("list");
	
	JButton button1 = new JButton("add");
	JButton button2 = new JButton("clear");
	
	JTextField field1 = new JTextField(10);
	
	String s[] = {};
	JComboBox combo = new JComboBox(s);
	
	Vector<String> myvec = new Vector<String>();
	
	test(){
		setLayout(new FlowLayout());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(panel1());
		add(panel2());
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		pack();
	}
	
	
	JPanel panel1(){
		JPanel p = new JPanel(new GridLayout(2,2));
		p.add(label1);
		p.add(field1);
		p.add(label2);
		p.add(combo);
	
		return p;
	}
	
	JPanel panel2(){
		JPanel p = new JPanel(new GridLayout(2,1));
		p.add(button1);
		p.add(button2);
		
	
		return p;
	}
	
	public static void main(String[] args) {
		new test();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1){
			combo.removeAllItems();
			String key = field1.getText();
			myvec.add(key);
			
			}
		
		for(String a : myvec){
			combo.addItem(a);
		}
		
		
		
		if(e.getSource()==button2){
			combo.removeAllItems();
		}
		
	}

}
