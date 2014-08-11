import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class TCPServerAuth {

	
	public static void main(String[] args) {
		
		try{
			ServerSocket server = new ServerSocket(8080);
			
			Socket client = server.accept();
			String msg="";
			String username = "system";
			String password = "manager";
			
			System.out.println( client.getInetAddress().getHostAddress() + " connected...");
			
			do{
				//Reading data from client
				BufferedReader fromClient = 
						new BufferedReader( new InputStreamReader(client.getInputStream()));
				
				//Sending data to Client
				DataOutputStream toClient = 
						new DataOutputStream(client.getOutputStream());
				
				toClient.writeBytes("Enter username:");
				
				String givenUsername = fromClient.readLine();
				
				toClient.writeBytes("Enter password:");
				
				String givenPassword = fromClient.readLine(); 				
				
				if ( username.equals(givenUsername) && password.equals(givenPassword))
					toClient.writeBytes( "You are logged in\r\n" );
				else
					toClient.writeBytes( "Incorrect login\r\n" );
				
			}while(!msg.equals("exit"));
			
			
		}catch(Exception e){
			System.out.println( e.toString());
		}
		
	}

}
