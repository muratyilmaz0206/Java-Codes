
// bu program array içindeki sayýlarý toplar.

import javax.swing.JOptionPane;


public class VectorEx {

	
	public static void main(String[] args) {
		
		int numberList[]= {34,11,113,88,167,55,98};
		
		int sum=0;
		
		for (int i=0; i<numberList.length; i++){
			
			sum += numberList[i];
		}
		
		JOptionPane.showMessageDialog(null," Total is : " + sum);
		
		
		

	}

}