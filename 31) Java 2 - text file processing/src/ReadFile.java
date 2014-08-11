import java.io.FileInputStream;

public class ReadFile {
	
	ReadFile(String pPath){
		
		FileInputStream fis = null;
		
		try{
						
			fis = new FileInputStream(pPath);
			int value;
			
			do{
				value = fis.read();
				System.out.print((char)value);
				
			}while(value != -1);
			
		}catch(Exception e){
			System.out.println(e.toString());
		}		
	}
	
	public static void main(String[] args) {

new ReadFile("C:\\FruitDetail.java");
	}

}
