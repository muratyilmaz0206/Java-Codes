import java.io.DataInputStream;
import java.io.FileInputStream;


public class ReadBinaryFile {


	public static void main(String[] args) {
		
		try{
		DataInputStream dis =
				new DataInputStream(new FileInputStream("d:\\test\\myfile.bin"));
		
		int a = dis.readInt();
		float f = dis.readFloat();
		double d = dis.readDouble();
				
				System.out.println("int is " +a);
				System.out.println("float is " +f);
				System.out.println("double is " +d);
				
				
		
		}catch(Exception e){
			System.out.println(e.toString());
		}
		
	}

}
