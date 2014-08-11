import java.io.DataOutputStream;
import java.io.FileOutputStream;


public class WriteBinaryFile {

	
	public static void main(String[] args) {
	
		try{
		DataOutputStream dos = 
				new DataOutputStream(new FileOutputStream("d:\\test\\myfile1.bin"));
		
		dos.writeInt(35);
		dos.writeFloat(56.45f);
		dos.writeDouble(4545.56);
		
		
		//dos.writeBytes("hello this is an example");
			
		// dosyaya boolean, int, double deðerler yazýyor on kere..
		//for(int i=10; i<1; i++)	
		//dos.writeInt(1500);
		//dos.writeDouble(34.45);
		//dos.writeBoolean(true);
		dos.close();
		}catch(Exception e){
			System.out.println(e.toString());
		}

	}

}
