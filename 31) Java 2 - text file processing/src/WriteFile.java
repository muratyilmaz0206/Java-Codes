import java.io.FileOutputStream;

public class WriteFile {
	
	WriteFile(String pPath, String pContent){
		
		FileOutputStream fos = null;
		
		try{
			
			fos = new FileOutputStream(pPath);
			
			char[] str = pContent.toCharArray();
			
			for(int i =0; i<str.length; i++){
				char c = str[i];
				fos.write(c);
			}
			
			fos.close();
				
		}catch(Exception ee){
			System.out.println(ee.toString());
		}	
	}
	
	public static void main(String[] args) {

		new WriteFile("c:\\aaa.txt", " dnmslnvfdslnvlkdfnvlkdfnvklfndvlknfdlkvn");
		
	}
}
