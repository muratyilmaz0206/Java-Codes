import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Q2 extends JFrame {

	JTextField tfTurkish= new JTextField(10);
	JTextField tfEnglish = new JTextField(10);
	HashMap<String, String> hm = new HashMap<String, String>();
	Q2(){
		hm.put("elma", "apple");
		hm.put("muz", "banana");
		hm.put("cilek", "strawberry");
		hm.put("portakal", "orange");
		
		setVisible(true);
		setLayout(new FlowLayout());
		add( new JLabel("English"));
		add(tfEnglish); 
		tfEnglish.addKeyListener( new KeyLsnr1());
		add( new JLabel("Turkish"));
		add(tfTurkish);
		tfTurkish.addKeyListener( new KeyLsnr2());
		
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Q2();

	}
	
	public class KeyLsnr1 implements KeyListener{

		@Override
		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			
			
			Set set = hm.entrySet();
			
			Iterator i = set.iterator();
			
			while(i.hasNext()){
				Map.Entry me = (Map.Entry)i.next();
				String val = me.getValue().toString();
				if ( val.equals(tfEnglish.getText()))	
					tfTurkish.setText( me.getKey().toString());
			}		
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
						
		}
	}
	
	public class KeyLsnr2 implements KeyListener{

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			tfEnglish.setText( hm.get(tfTurkish.getText()) );
			
		}

		public void keyTyped(KeyEvent e) {
			
		}
	}


}