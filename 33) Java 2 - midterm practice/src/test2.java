import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class test2 extends JFrame{


	JLabel label1 = new JLabel("turkish");
	JLabel label2 = new JLabel("english");
	
	JTextField field1 = new JTextField(10);
	JTextField field2 = new JTextField(10);
	
	Vector<String> myvec = new Vector<String>();
	
	test2(){
		setLayout(new FlowLayout());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myvec.add("be"); 
		myvec.add("happy"); 
		myvec.add("do"); 
		
		add(label2);
		add(field1);
		
		add(label1);
		add(field2);
		
		field1.addKeyListener(new mykey());
		
		pack();	
	}
	
	public static void main(String[] args) {
		new test2();
	}

	
	class mykey implements KeyListener{

		@Override
		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
			
			String search = field1.getText();
			
			for(String ap : myvec){
				
				if(search.equalsIgnoreCase("be")){
					field2.setText("olmak");
					
				}
				
				else	if(search.equalsIgnoreCase("happy")){
					field2.setText("mutlu");
					
				}
				
				
				
				else	if(search.equalsIgnoreCase("do")){
					field2.setText("yapmak");
					
				}
				
				else field2.setText("not defined");
				
			}
	
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
		
		}
		
	}

}
