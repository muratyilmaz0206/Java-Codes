import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
 
public class MouseListener2 extends JFrame{
	int lastX = 0;
	int lastY = 0;
	
	int prevX = 0;
	int prevY = 0;
	
	MouseListener2(){
		setLayout( new FlowLayout());
	 
		addMouseMotionListener(new MyMouseListener2());
	 
		setSize( 640, 480);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	public void paint(Graphics g){
		//super.paint(g);
		g.setColor(Color.red);
		if ( prevX!=0)
			g.drawLine(prevX, prevY, lastX, lastY);
	}
	public static void main(String[] args) {
		new MouseListener2();

	}
	class MyMouseListener2 implements MouseMotionListener{

		public void mouseDragged(MouseEvent arg0) {
			prevX = lastX;
			prevY = lastY;
			
			lastX = arg0.getX();
			lastY = arg0.getY();
			repaint();
		}

		public void mouseMoved(MouseEvent arg0) {
						
		}
		
	}
 

}
