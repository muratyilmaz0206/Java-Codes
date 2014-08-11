import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;


public class Q1 extends JFrame implements MouseMotionListener{
	int lastX, lastY;
	Q1(){
		setVisible(true);
		setLayout(null);
		setSize(400, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseMotionListener(this);
	}
	
	public void paint(Graphics g){
		g.drawLine(200, 0, 200, 800);
		if ( lastX >=200)
			g.drawOval(lastX, lastY, 10, 10);
		else 
			g.drawRect(lastX, lastY, 10, 10);
	}
	
	public static void main(String[] arg){
		new Q1();
	}

	public void mouseDragged(MouseEvent arg0) {
		lastX = arg0.getX();
		lastY = arg0.getY();
		repaint();
	}
	
	public void mouseMoved(MouseEvent arg0) {
		
	}
	

}