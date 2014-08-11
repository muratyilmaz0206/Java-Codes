import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Vector;

import javax.swing.JButton;
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
		setBackground(Color.WHITE);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.red);
		
		int prev_x= ((point)point_list.get(0)).x;
		int prev_y= ((point)point_list.get(0)).y;
		
		for(point pt : point_list){
			g.drawLine(pt.x, pt.y, prev_x, prev_y);
			
			prev_x = pt.x;
			prev_y = pt.y;
			
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
