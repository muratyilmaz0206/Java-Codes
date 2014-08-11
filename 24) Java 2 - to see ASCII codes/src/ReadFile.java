import java.io.FileInputStream;


public class ReadFile {


	public static void main(String[] args) {
	
		try{
		FileInputStream fis = new FileInputStream("c:\\wamp\\a.txt");
		
		int i=0;
		
		do{
			
			i=fis.read();
			
	
			if(i>0) 
			System.out.print((char)i);
			System.out.println("-" +i);
			
		}while(i>0);
		
		
		
		}catch(Exception e){
			System.out.println(e.toString());
		}
		
	}

}
