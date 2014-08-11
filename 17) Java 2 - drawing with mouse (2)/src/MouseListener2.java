import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Vector;

import javax.swing.JFrame;
 
public class MouseListener2 extends JFrame{
	int lastX = 0;
	int lastY = 0;
	
	int prevX = 0;
	int prevY = 0;
	Vector<point> point_list = new Vector<point>();
	
	MouseListener2(){
		setLayout( new FlowLayout());
	 
		addMouseMotionListener(new MyMouseListener2());
	 
		setSize( 640, 480);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.red);
		for(point pt : point_list){
			g.drawLine(pt.x, pt.y, pt.x+1, pt.y+1);
		}
		
		//if ( prevX!=0)
			//g.drawLine(prevX, prevY, lastX, lastY);
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
			
			point p = new point (lastX, lastY);
			point_list.add(p);
			
			repaint();
		}

		public void mouseMoved(MouseEvent arg0) {
						
		}
		
	}
 
	// it stores the coordinates
	class point {
		int x;
		int y;
		
		point (int x, int y){
			this.x=x;
			this.y=y;
		}
		
	}
	
	
	

}
