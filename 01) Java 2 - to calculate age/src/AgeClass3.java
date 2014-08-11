
// bu program gün ay yýl þeklinde yaþý hesaplar.

import javax.swing.JOptionPane;

public class AgeClass3 {


	public static void main(String[] args) {
		
	String birthyear =  JOptionPane.showInputDialog(null,"Enter your birth date : (YYYY-MM-DD)");
		
	int year = Integer.parseInt(birthyear.split("-")[0]);
	int month = Integer.parseInt(birthyear.split("-")[1]);
	int day = Integer.parseInt(birthyear.split("-")[2]);
			
			
			
			
		int myage = (365*(2013-year) + 31*(10-month) + (3-day))/365;
		
		JOptionPane.showMessageDialog(null, " You are " + myage + " years old ");
		
		if(myage>20){
			JOptionPane.showMessageDialog(null, " You must be a Good Java Programmer Now :) ");
		}
		else
			JOptionPane.showMessageDialog(null, " You must learn Java Programming ");
	}

}