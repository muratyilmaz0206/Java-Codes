import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class GUITest extends JFrame implements ActionListener {
	
	Vector <People> peoplelist = new Vector<People>();
	
	JTextField tfname,tfage,tsmall;
	JComboBox<String> cb;
	JTextArea ta = new JTextArea(10,20);
	JScrollPane spane = new JScrollPane(ta);
	
	JButton btnadd,btnlist;
	
	GUITest(){
		
		setLayout( new FlowLayout() );
		
		JLabel lbl = new JLabel("name : ");
		 tfname = new JTextField (10);
		
		JLabel lbl2 = new JLabel("age : ");
		tfage = new JTextField(10);
		
		JLabel lbl3 = new JLabel("smaller from this age : ");
		tsmall = new JTextField(10);
		
		String[] st = {"Female", "Male"};
		
		 cb = new JComboBox<>(st);
		
		
		 btnadd = new JButton("add to list");
		btnadd.addActionListener(this);
		
		 btnlist = new JButton("show all");
		btnlist.addActionListener(this);
		
		
		add(lbl);
		add( tfname);
		
		add(lbl2);
		add(tfage);
		
		add(lbl3);
		add( tsmall);
		
		
		add(cb);
		
		add( btnadd);
		add(btnlist);
		add(spane);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		pack();
		
		
			
		
	}

	public static void main(String[] args) {
			
		new GUITest();
			
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==btnadd){
	
			People p = new People(tfname.getText());
	p.age = Integer.parseInt(tfage.getText());
	p.gender = cb.getSelectedIndex();
			
	peoplelist.add(p);
	
		}
		else if (e.getSource()== btnlist){
			
			int small =Integer.parseInt(tsmall.getText());
			ta.setText("");
			
			for(People p : peoplelist){
				
				if(p.age<small) 
				
				ta.setText (ta.getText() + "\n" + p.getName() + " " + p.getGender()+
						" " + " " + p.age);
		
				
			}
		}
			
		
		
		
	}
		
	}




