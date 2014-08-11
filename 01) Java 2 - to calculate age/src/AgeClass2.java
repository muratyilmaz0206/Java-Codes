

// bu program yaþ hesaplar ve if condition ile mesaj iletir.

import javax.swing.JOptionPane;


public class AgeClass2 {


	public static void main(String[] args) {
		
		int birthyear = Integer.parseInt( JOptionPane.showInputDialog(null,"Enter your birth year : "));
		
		int myage = 2013 - birthyear;
		
		JOptionPane.showMessageDialog(null, " You are " + myage + " years old ");
		
		if(myage>20){
			JOptionPane.showMessageDialog(null, " You must be a Good Java Programmer Now :) ");
		}
		else
			JOptionPane.showMessageDialog(null, " You must learn Java Programming ");
	}

}