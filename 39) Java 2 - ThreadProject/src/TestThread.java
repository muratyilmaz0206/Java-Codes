import java.text.SimpleDateFormat;
import java.util.Calendar;


public class TestThread {
	
	public static void main(String[] args) {

		MyThread[] myThreadList = new MyThread[10];
		
		// initialization of threads
		for(int i =0;i<10;i++){
			myThreadList[i] = new MyThread("Thread " + i);
			myThreadList[i].start();	
			
		}
		
		// wait for 1.5 sec
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			
		}
		
		
		for(int i=0; i<5;i++){
			
			if(myThreadList[i].isAlive()) // önce canlýmý diye kontrol ediyor.
			myThreadList[i].interrupt();
		
	}
		

}
	

}
