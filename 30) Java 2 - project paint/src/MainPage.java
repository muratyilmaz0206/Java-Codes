import java.awt.*;

import javax.swing.*;


public class MainPage extends JFrame{


	public static void main(String[] args){
		Painting paint = new Painting();
		JFrame frm=new JFrame("PAÝNT UYGULAMASI");
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLUE),"20090109-MEHMET OZKAN"));
		panel.add(paint);
		frm.add(panel);
		paint.getComponent(0).requestFocus();
		frm.setSize(600, 600);
		frm.setVisible(true);

	}
}
