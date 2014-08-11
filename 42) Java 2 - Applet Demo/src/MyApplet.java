import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class MyApplet extends JApplet {
	JTextArea tf = new JTextArea(10,10);
	JButton btn = new JButton( "Hello applet");
	
	
	public MyApplet(){
		setLayout(new FlowLayout());
		add( tf );
		add( btn);
		
		btn.addActionListener(new ActionListener() {			 
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "I am very similiar to JFrames");
			}
		});
		setSize(200, 200);
	}
	
	public void init(){
		tf.append("Init state" + "\n");
	}
	public void start(){
		tf.append("Start state" + "\n");
	}
	public void stop(){
		tf.append("Stop state" + "\n");
	}
	public void destroy(){
		tf.append("Destroy state" + "\n");
	}
	

}
