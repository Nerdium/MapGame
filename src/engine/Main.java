package engine;

import java.util.Scanner;

import engine.io.MarketOutput;
import engine.network.Client;
import engine.network.Server;
import engine.util.Timestamp;
import game.market.GoodType;
import game.market.Market;
import game.market.SellerInfo;

public class Main {
	
	//@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Market market = new Market();
		SellerInfo seller = new SellerInfo("Nerdium");
		market.addTrade(GoodType.IRON_ORE, seller, 5, 1.5);
		market.printTradeReport("report1");
		
		System.out.println(new Timestamp());
		
		
	/*
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
		*/
	}
	
	
	
}
