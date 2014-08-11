import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class test extends JFrame implements ActionListener {

//-----------------------------------------------------------------------------------------------------------------	
	
	JLabel labelname = new JLabel("fruit name");
	JLabel labelprice = new JLabel("price");
	JLabel labelorigin = new JLabel("origin");
	
	JTextField fieldname = new JTextField(10);
	JTextField fieldprice = new JTextField(10);
	JTextField fieldorigin = new JTextField(10);
	
	
	JButton buttonadd = new JButton("add");
	JButton buttonfind = new JButton("find");
	
	HashMap< String, Float > hm = new HashMap< String, Float >();
	HashMap< String, String > hm2 = new HashMap< String , String >();

//-----------------------------------------------------------------------------------------------------------------	
	test(){
		setLayout(new FlowLayout());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(500,300);
		
		add(panel1());
		add(panel2());
		
		
		buttonadd.addActionListener(this);
		buttonfind.addActionListener(this);
		
		pack();
	}
	
//-----------------------------------------------------------------------------------------------------------------	
	
	JPanel panel1(){
		JPanel p = new JPanel(new GridLayout(3,2));
		p.add(labelname);
		p.add(fieldname);
		p.add(labelprice);
		p.add(fieldprice);
		p.add(labelorigin);
		p.add(fieldorigin);
		
		
		return p;
	}
	
	

	JPanel panel2(){
		JPanel p = new JPanel(new GridLayout(2,1));
		p.add(buttonadd);
		p.add(buttonfind);
		
		
		return p;
	}
	
//-----------------------------------------------------------------------------------------------------------------
	
	public static void main(String[] args) {
		new test();
	}


//-----------------------------------------------------------------------------------------------------------------

	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==buttonadd){
			String fname = fieldname.getText();
			Float fprice = Float.parseFloat(fieldprice.getText());
			String forigin = fieldorigin.getText();
			
			hm.put(fname, fprice);
			hm2.put(fname, forigin);
			
			JOptionPane.showMessageDialog(null, "number of items in HM :" + hm.size());
			
		}
		
		
		if(e.getSource()==buttonfind){
			
			
			String search_key = fieldname.getText();
			
			Float fprice = hm.get(search_key);
			
					fieldprice.setText(fprice.toString());
					
			String forigin = hm2.get(search_key);
			
				fieldorigin.setText(forigin);
					
					
		}
		
//-----------------------------------------------------------------------------------------------------------------	
		
	}

}
