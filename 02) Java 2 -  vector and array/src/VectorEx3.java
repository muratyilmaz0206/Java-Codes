
// kullan�c� 0 girene kadar say�lar� arrayde tutar 0 girildi�inde toplam sonucu yazd�r�r.

import java.util.Vector;

import javax.swing.JOptionPane;


public class VectorEx3 {

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
				
		int test = -1;
		
		for(int i=0; test!=0;i++){
			
			test = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter number"));
			myNumbers.add(test);
			
		}
		
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