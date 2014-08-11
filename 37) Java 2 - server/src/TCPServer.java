import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class TCPServer {

	/**
	 * @param args
	 */
	
	// putty localhost 8080 yaz raw seç baðlandýktan sonra yazdýðýn bu konsoldada çýkar.
	
	public static void main(String[] args) {
		
		
		try{
		ServerSocket myServer = new ServerSocket(8080); // rastgele seçtik 8080
		
		System.out.println("wait for connection");
		Socket connectionSocket = myServer.accept(); // connection to the client
		System.out.println("client connected");
		
		while(true){
			
			
			BufferedReader fromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
			
			String clientSend = fromClient.readLine();
			
			System.out.println("client sent :" + clientSend);
			
			DataOutputStream toClient = new DataOutputStream(connectionSocket.getOutputStream());
			
			toClient.writeBytes(clientSend.toUpperCase() + "\n");
		}
		
		} catch(Exception e){
			System.out.println(e.toString());
		};

	}

}
