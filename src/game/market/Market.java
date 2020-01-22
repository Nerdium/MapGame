package game.market;

import java.util.ArrayList;

import engine.io.MarketOutput;

public class Market {
  private int idCounter = 1;
  private ArrayList<MarketList> marketLists = new ArrayList<MarketList>();
  MarketOutput marketOutput;

  public Market() {
    for(GoodType type : GoodType.values()) {
      marketLists.add(new MarketList(type));
    }
    
    marketOutput = new MarketOutput("output/market/");
  }

  public int getNextId() {
    idCounter++;
    return idCounter - 1;
  }
  
  public void addTrade(GoodType type, SellerInfo seller, int amount, double pricePerUnit) {
	  for(MarketList marketList : marketLists) {
		  if(marketList.getType() == type) {
			  marketList.addTrade(getNextId(), seller, amount, pricePerUnit);
		  }
	  }
  }
  
  public void printTradeReport(String filename) {
	  String report = "---% Market Trade Report %--- \n";
	  for(MarketList marketList : marketLists) {
		  report += marketList.generateTradeReport();
	  }
	  marketOutput.printTrades(filename, report);
  }
  
}
