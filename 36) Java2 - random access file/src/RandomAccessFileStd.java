import java.io.RandomAccessFile;


public class RandomAccessFileStd {

	
	//Student number - Student name - cgpa
	//    int       | |  char(20)  | | double
	//  4 bytes     | | 40 bytes   | | 8 bytes = 52 bytes
 	
	
	 RandomAccessFileStd() throws Exception {
		 
		 RandomAccessFile raf = null;
		raf = new RandomAccessFile("d:\\data\\students.txt","rw");
		 
		writeStudent(raf,20090685,"Murat Yýlmaz",3.25);
		writeStudent(raf,20090475,"Alan Turing",2.80);
		writeStudent(raf,20090867,"Anthony Hopkins",3.75);
		writeStudent(raf,20090123,"Tony Hendry",3.15);
		writeStudent(raf,20090367,"Alan Delon",1.25);
		 
	 }
	
	 void writeStudent(RandomAccessFile pRaf,int stdNumner, String pName, double pCGPA) throws Exception {
		 
		 pRaf.writeInt(stdNumner);
		 pRaf.writeChars(pName);
		 
		 int length = pName.length();
		 
		 for(int i=0; i<20-length; i++){
			 pRaf.writeChar(' ');
		 }
		 
		 pRaf.writeDouble(pCGPA);
		 
		 }
	
	
	
	public static void main(String[] args)  {
		
		try{
		
		new  RandomAccessFileStd();
		
		} catch(Exception e){};
	}
	
}
