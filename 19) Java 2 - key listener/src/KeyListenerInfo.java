import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class KeyListenerInfo extends JFrame {

	JTextField tf = new JTextField(10);
	JTextArea ta = new JTextArea(10,20);
	
			
			
			KeyListenerInfo(){
		
				setLayout(new FlowLayout());
				
				add(tf);
				tf.addKeyListener(new MyKeyListener());
				
				JScrollPane sp = new JScrollPane(ta);
				add(sp);
				
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setVisible(true);
				pack();
		
		
	}
		
	
	
	
	public static void main(String[] args) {
		
new KeyListenerInfo();
	}

	
	class MyKeyListener implements KeyListener{

		
		public void keyPressed(KeyEvent e) {
			ta.append ("key presses " + "char :" + e.getKeyChar() + ": " + "  code : " + e.getKeyCode() + "\n");
			
		}

	
		public void keyReleased(KeyEvent e) {
			ta.append ("key released " + "char :" + e.getKeyChar() + ": " + "  code : " + e.getKeyCode() + "\n");
			
		}

		
		public void keyTyped(KeyEvent e) {
			ta.append ("key typed " + "char :" + e.getKeyChar() + ": " + "  code : " + e.getKeyCode() + "\n");
		
			
		}
		
		
	}
	
	
	
}
