import java.io.DataInputStream;
import java.io.FileInputStream;

public class FindSizeOfFile {
	
public static void main(String[] args) {
		
		try{
		DataInputStream dis =
				new DataInputStream(new FileInputStream("d:\\test\\myfile.bin"));
			
		int count =0;
		
		try{
		
			do{
		
		dis.readByte();
		 count++;
		
		}while(true);	
				
		}catch(Exception e){}
		System.out.println("the size of file is " + count + " bytes");
		
	}catch (Exception e){
		System.out.println(e.toString());
		}
	}
}
