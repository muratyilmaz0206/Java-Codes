
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class KeyListener2 extends JFrame{

	JTextField tf = new JTextField(10);
	JTextArea ta = new JTextArea(20,30);
			
	KeyListener2(){
		setLayout( new FlowLayout());
		add( tf );
		
		tf.addKeyListener( new MyKeyListener());
		
		JScrollPane sp = new JScrollPane(ta);
		add(sp);
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	
	public static void main(String[] args) {
		new KeyListener2();

	}
	
	class MyKeyListener implements KeyListener{

		public void keyPressed(KeyEvent e) {			
		}

		public void keyReleased(KeyEvent e) {
			int c = e.getKeyCode();
			if ( c == 10){
				ta.append( tf.getText() + "\n");
				tf.setText("");
			}
		}
		public void keyTyped(KeyEvent e) {			
				
		}			
	}
}
