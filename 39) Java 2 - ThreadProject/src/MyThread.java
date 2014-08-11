
public class MyThread extends Thread{

	String myName ="";
	MyThread(String name){
		myName=name;
	}
	
	
	public void run(){
		for(int i =0; i<100; i++){
			System.out.println(myName + ":" + i);
			
			// to wait 10 milisec.
			try{
			Thread.sleep(100);
			}catch(InterruptedException e){
				System.out.println("YOU KILL ME!");
				break;
			}
		}
		
	}
	
}
