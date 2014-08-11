import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class TCPServer {

	
	public static void main(String[] args) {
		
		try{
			ServerSocket server = new ServerSocket(8080);
			do{
				Socket client = server.accept();
								
				ThreadConnection t = new ThreadConnection(client);
				t.start();
			}while(true);
			
		}catch(Exception e){
			System.out.println( e.toString());
		}
		
	}

}
