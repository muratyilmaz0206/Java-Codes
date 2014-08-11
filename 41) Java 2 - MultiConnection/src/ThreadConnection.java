import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;


public class ThreadConnection extends Thread{
	Socket mySocket = null;
	
	ThreadConnection(Socket pSocket){
		mySocket = pSocket;		
	}
	
	public void run(){
		String msg="";
		
		try{
			System.out.println( mySocket.getInetAddress().getHostAddress() + " connected...");
			
			do{
				//Reading data from client
				BufferedReader fromClient = 
						new BufferedReader( new InputStreamReader(mySocket.getInputStream()));
				
				//Sending data to Client
				DataOutputStream toClient = 
						new DataOutputStream(mySocket.getOutputStream());
				
				
				msg = fromClient.readLine();
				
				System.out.println( msg );
				
				String sendData = msg.toUpperCase();				
				
				toClient.writeBytes( sendData + '\n' );
				
				System.out.println( "data send to client");
				
			}while(!msg.equals("exit"));
		}catch(Exception e){
			System.out.println( e.toString());
		}
	}

}
