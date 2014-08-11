import java.io.RandomAccessFile;


public class RandomAccessDemo {


	public static void main(String[] args) {
		

		double[] data = {10.5,63.45,45.4,14.5,12.0,120.5,613.45,425.4,144.5,412.0};
		
		RandomAccessFile raf = null;
		
		
		try{
			
			
			raf = new RandomAccessFile("d:\\data\\numbers.bin","rw");
			// write values to file
			
			for(int i=0;i<data.length;i++){
				raf.writeDouble(data[i]);
			}
			
		}catch(Exception e){
			
		};
		
		
		
		
	}

}
