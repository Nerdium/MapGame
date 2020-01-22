package engine.network;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
	Socket socket;
	BufferedReader input;
	DataOutputStream output;
	public Client(String address, int port) {
		try {
			socket = new Socket(address, port);
			System.out.println("Connected");
			
            input  = new BufferedReader(new InputStreamReader(System.in));
            output = new DataOutputStream(socket.getOutputStream()); 
			
		} catch (Exception e) {
			System.out.println("An error occured: ");
			e.printStackTrace();
		}
		// string to read message from input 
        String line = ""; 
  
        // keep reading until "Over" is input 
        while (!line.equals("Over")) 
        { 
            try
            { 
                line = input.readLine(); 
                output.writeUTF(line); 
            } 
            catch(IOException i) 
            { 
                System.out.println(i); 
            } 
        } 
  
        // close the connection 
        try
        { 
            input.close(); 
            output.close(); 
            socket.close(); 
        } 
        catch(IOException i) 
        { 
            System.out.println(i); 
        } 
	}
}
