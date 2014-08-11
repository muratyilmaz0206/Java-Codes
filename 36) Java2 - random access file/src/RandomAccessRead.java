import java.io.RandomAccessFile;


public class RandomAccessRead {

	
	public static void main(String[] args) {

		double[] data = {10.5,63.45,45.4,14.5,12.0,120.5,613.45,425.4,144.5,412.0};
		
		RandomAccessFile raf = null;
		
		
		try{
			
			
			raf = new RandomAccessFile("d:\\data\\numbers.bin","rw");
		
			raf.seek(40); // 1 double = 8byte  40. bayta konumlan ve 40 sonrasýndan 48 e kadarkini oku.
			//önce konumlan sonra oku mantýðý.
			double d = raf.readDouble();
			System.out.println("value retrieved from file:" + d);
		
		
			
		}catch(Exception e){
			
		};
		
		

	}

}
