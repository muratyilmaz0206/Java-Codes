import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JOptionPane;


public class TCPClient {

	
	public static void main(String[] args) {
		try{
			Socket clientSocket = new Socket("127.0.0.1", 8080);
			
			// client -> server
			DataOutputStream outToServer = 
					new DataOutputStream( clientSocket.getOutputStream());
			//server-> client
			BufferedReader inFromServer =
					new BufferedReader( new InputStreamReader( clientSocket.getInputStream()));
			String sentence ="";
			do{
				sentence = JOptionPane.showInputDialog("Enter your sentence");
				outToServer.writeBytes( sentence + '\n');
				String modifiedSentene = inFromServer.readLine();
				JOptionPane.showMessageDialog(null, "FROM SERVER: " + modifiedSentene );
			}while(! sentence.equals("exit"));
			
			
			
		}catch(Exception e){
			System.out.println( e.toString() );
		}

	}

}
