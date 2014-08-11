
// bu program yaþ hesaplar.

import javax.swing.JOptionPane;


public class AgeClass {


	public static void main(String[] args) {
		
		int birthyear = Integer.parseInt( JOptionPane.showInputDialog(null,"Enter your birth year : "));
		
		JOptionPane.showMessageDialog(null, " You are " + (2013-birthyear) + " years old ");
		
	}

}
