import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
 
public class MouseListenerInfo extends JFrame{
	JTextField tf = new JTextField(10);
	JTextArea ta = new JTextArea(20,30);
	
	MouseListenerInfo(){
		setLayout( new FlowLayout());
		add( tf );
		addMouseListener(new MyMouseListener()) ;
		addMouseMotionListener(new MyMouseListener2());
		JScrollPane sp = new JScrollPane(ta);
		add(sp);
		setSize( 640, 480);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	public static void main(String[] args) {
		new MouseListenerInfo();

	}
	class MyMouseListener2 implements MouseMotionListener{

		public void mouseDragged(MouseEvent arg0) {
			tf.setText("drag:"+arg0.getX() + "," + arg0.getY());
		}

		public void mouseMoved(MouseEvent arg0) {
			tf.setText("move:"+arg0.getX() + "," + arg0.getY());			
		}
		
	}
	class MyMouseListener implements MouseListener{

		public void mouseClicked(MouseEvent arg0) {
			ta.append("Mouse Clicked\n")	;
		}

		public void mouseEntered(MouseEvent arg0) {
			ta.append("Mouse Enter\n")	;
		}
		
		public void mouseExited(MouseEvent arg0) {
			ta.append("Mouse Exit\n")	;
		}
 
		public void mousePressed(MouseEvent arg0) {
			ta.append("Mouse Pressed\n")	;		
		}

		public void mouseReleased(MouseEvent arg0) {
			ta.append("Mouse Released\n")	;
		}
		
	}

}
