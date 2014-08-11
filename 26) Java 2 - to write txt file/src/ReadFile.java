import java.io.FileInputStream;
import java.io.FileOutputStream;



public class ReadFile {

	
	public static void main(String[] args) {
		
		try{
			FileInputStream fis = new FileInputStream("c://wamp/corel.txt");
			
			int i = 0;
			do{
				i = fis.read();
				if(i>0)
				System.out.print((char)i);
				//System.out.println( "-" + i);
				
			}while(i>0);
		}catch(Exception e){
			System.out.println(e.toString());
		}
		try{
			FileOutputStream fos = new FileOutputStream("c://wamp/out.txt");
			String txt = "you will understand how it works..";
			char[] chr = txt.toCharArray();
			
			for(int i=0;i<chr.length;i++){
				fos.write(chr[i]);
			}
			fos.close();
			
			
		}catch(Exception e){
			System.out.println(e.toString());
		}

	}

}
