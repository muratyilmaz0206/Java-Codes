import java.io.RandomAccessFile;


public class CalculateAverage {

	
	 CalculateAverage(){
		 
		 try{
			 
			 RandomAccessFile raf = null;
				raf = new RandomAccessFile("d:\\data\\students.txt","rw");
				
				int rec_no=0;
				double total =0;
				
				do{
					raf.seek(rec_no*52 +44);
					double d = raf.readDouble(); // CGPA
					
					total+=d;
					
					System.out.println(d);
					
					rec_no++;
					
				}while(raf.getFilePointer()<raf.length());
			 raf.close();
			 
			 System.out.println("average is : " + total/ rec_no);
		 }catch(Exception e){
			 
		 }
		 
	 }
	
	
	
	
	public static void main(String[] args) {
	new CalculateAverage();

	}

}
