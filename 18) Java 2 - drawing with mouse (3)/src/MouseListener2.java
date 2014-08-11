import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
 
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
		
		if ( point_list.size()>0){
			int prev_x = ((point)point_list.get(0)).x;
			int prev_y = ((point)point_list.get(0)).y;
		
			for (point pt : point_list) {
				//g.drawLine(pt.x, pt.y, prev_x, prev_y);
				g.drawArc(pt.x, pt.y, 50, 50, 0, 360);
			
				prev_x = pt.x;
				prev_y = pt.y;			
			}
		}
		/*if ( prevX!=0)
			g.drawLine(prevX, prevY, lastX, lastY);*/
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
			
			point p = new point( lastX, lastY);
			point_list.add(p);
			
			repaint();
		}

		public void mouseMoved(MouseEvent arg0) {
						
		}
		
	}
	
	class point {
		int x;
		int y;
		
		point (int x, int y){
			this.x = x;
			this.y = y;
		}
	}
 

}
