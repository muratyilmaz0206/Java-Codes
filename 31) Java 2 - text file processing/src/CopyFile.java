import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {
	
	CopyFile( String pSource, String pDestination){
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
				
		try{
			
			fis = new FileInputStream(pSource);
			fos = new FileOutputStream(pDestination);
				
			int i=0;
			
			do {
				
				i = fis.read();
				fos.write(i);
				
			}while(i>0);
			
			fos.close();
			fis.close();
			
		}catch(Exception e){
			
			System.out.println(e.toString());
		}
		
	}
	
	public static void main(String[] args)  {
	
		new CopyFile("C:\\from.txt","C:\\to.txt");
	}
}
