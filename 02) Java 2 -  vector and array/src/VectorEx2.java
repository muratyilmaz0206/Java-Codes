
// array'daki sayýlarý toplar ama yazým þekli farklýdýr.

import java.util.Vector;

import javax.swing.JOptionPane;


public class VectorEx2 {

	/*public static void arrayexample(){
int numberList[]= {34,11,113,88,167,55,98};
		
		int sum=0;
		
		for (int i=0; i<numberList.length; i++){
			
			sum += numberList[i];
		}

		JOptionPane.showMessageDialog(null," Total is : " + sum);
	}
	
	*/
	public static void VectorExa(){
		
		Vector<Integer> myNumbers = new Vector<Integer>();
				
		myNumbers.add(55);
		myNumbers.add(14);
		myNumbers.add(440);
		
		
		int sum=0;
		
		for(Integer integer : myNumbers){
			sum += integer;
			
		}
		
		JOptionPane.showMessageDialog(null," Total is : " + sum);
	}
	
	
		public static void main(String[] args) {
		
		
		VectorExa();
	
		

	}

}