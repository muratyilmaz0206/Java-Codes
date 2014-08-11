import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class FontManager extends JFrame{
	
	JTextField tf = new JTextField(20);
	String font_names[] = {"Arial", "Courier", "Times New Roman",
						   "Verdena", "Tahoma" };
	Integer font_size[] = new Integer[20];
	
	JComboBox cb = new JComboBox(font_names);
	JComboBox cb_size = null;
	
	FontManager(){
		for(int i=0; i<20; i++){
			font_size[i] = i+5;
		}
		cb_size = new JComboBox<>(font_size);
		
		setLayout( new FlowLayout());
		
		add( tf );
		add( cb );
		add( cb_size );
		cb.addItemListener(new ItmLsnr());	
		cb_size.addItemListener( new ItmLsnr());	
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class ItmLsnr implements ItemListener{

		public void itemStateChanged(ItemEvent e) {
			
			String font = (String)cb.getSelectedItem();
			
			Font f = new Font(font, Font.BOLD, (Integer)cb_size.getSelectedItem());
			
			tf.setFont( f );
		}
		
	}

	
	public static void main(String[] args) {
		new FontManager();

	}

}
