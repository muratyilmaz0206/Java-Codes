import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Dict extends JFrame{

	JTextField tf1 = new JTextField(10);
	JTextField tf2 = new JTextField(10);
	Vector<MyDictionary> dict = new Vector<MyDictionary>();
	
	Dict(){
		dict.add( new MyDictionary("elma", "apple"));
		dict.add( new MyDictionary("fare", "mouse"));
		dict.add( new MyDictionary("klavye", "keyboard"));
		dict.add( new MyDictionary("ogrenci", "student"));
		dict.add( new MyDictionary("sinav", "exam"));
		dict.add( new MyDictionary("not", "grade"));
		
		setLayout( new FlowLayout());
		add(new JLabel("Turkish:"));
		add(tf1);
		tf1.addKeyListener( new KeyLsnr() );
		add(new JLabel("English:"));
		add(tf2);
				
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	 
	public static void main(String[] args) {
		new Dict();

	}
	
	class KeyLsnr implements KeyListener{

		public void keyPressed(KeyEvent e) {
		
		}

		public void keyReleased(KeyEvent e) {
			String tr = tf1.getText();
			String en = "";
			
			for (MyDictionary d  : dict) {
				if (d.turkish.equals(tr)){
					en = d.english;
					break;
				}
			} 
			
			/*for(int i=0; i<dict.size(); i++){
				MyDictionary d = dict.get(i);
				if (d.turkish.equals(tr)){
					en = d.english;
					break;
				}
			}*/
			
			
			tf2.setText( en );
		}

		public void keyTyped(KeyEvent e) {
					
		}
		
	}
	
	class MyDictionary{
		String turkish, english;
		public MyDictionary(String pTurkish, String pEnglish) {
			turkish = pTurkish;
			english = pEnglish;
		}		
	}
	
	 

}
