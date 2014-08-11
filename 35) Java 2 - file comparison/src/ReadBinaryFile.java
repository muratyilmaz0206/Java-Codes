import java.io.DataInputStream;
import java.io.FileInputStream;


public class ReadBinaryFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
		DataInputStream dis1 = 
				new DataInputStream( new FileInputStream("d:\\temp\\Tulips.jpg"));		
		
		DataInputStream dis2 = 
				new DataInputStream( new FileInputStream("d:\\temp\\Penguins.jpg"));
		
		int byte1, byte2;
		
		do{
			byte1 = dis1.read();
			byte2 = dis2.read();
			
			if ( byte1 != byte2){
				System.out.println(" Files are different");
				break;
			}
				
		}while(byte1!=-1 && byte2 != -1);
		
		if ( byte1 == byte2){
			System.out.println(" Files are same");			
		}
		
		
		}catch(Exception e){
			System.out.println( e.toString());
		}

	}

}