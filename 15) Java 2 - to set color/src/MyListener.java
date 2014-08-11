import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JTextField;


public class MyListener implements ActionListener {

	JTextField myTf;
	JPanel myPanel;
	
	MyListener(JTextField pTF, JPanel pP){
		
		myTf = pTF;
		myPanel = pP;
		
	}
	
	
	

	public  void actionPerformed(ActionEvent e) {
	

		String[] rgb = myTf.getText().split(",");
	
		
		
		Color c = new Color(
			Integer.parseInt(rgb[0]),
			Integer.parseInt(rgb[1]),
			Integer.parseInt(rgb[2])
			);
		
		myPanel.setBackground(c);
		
		
		
	}

}
