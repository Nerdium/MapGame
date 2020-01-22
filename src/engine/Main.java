package engine;

import java.util.Scanner;

import engine.network.Client;
import engine.network.Server;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("Server (s) or client (c)?");
		Scanner sc = new Scanner(System.in);
		if(sc.nextLine().equals("s")) {
			System.out.println("Server chosen");
			Server server = new Server(6969);
		} else {
			System.out.println("Client chosen");
			Client client = new Client("localhost", 6969);
		}
		
		sc.close();
	}

}
