package engine.network;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.Socket;

public class Client extends Thread {
	Socket socket;
	BufferedReader input;
	DataOutputStream output;
	
	private String address;
	private int port;
	
	public Client(String address, int port) {
		this.address = address;
		this.port = port;
	}
	
	public void run() {
		
		if(!connect()) {
			return;
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
        close();
        
	}
	
	public boolean connect() {
		try {
			socket = new Socket(address, port);
			System.out.println("Connected");
			
            input  = new BufferedReader(new InputStreamReader(System.in));
            output = new DataOutputStream(socket.getOutputStream()); 
		} catch (ConnectException e) {
			System.err.println("Connection Failed...");
			return false;
		} catch (Exception e) {
			System.out.println("An error occured: ");
			e.printStackTrace();
		}
		return true;
	}
	
	public void close() {
		try
        { 
            input.close(); 
            output.close(); 
            socket.close(); 
        } 
        catch(IOException e) 
        { 
            e.printStackTrace();
        } 
	}
	
}
