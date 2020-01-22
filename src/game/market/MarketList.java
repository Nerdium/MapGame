package game.market;

import java.util.ArrayList;

public class MarketList {
  private GoodType type;
  private ArrayList<Trade> trades = new ArrayList<Trade>();
  
  public MarketList(GoodType type) {
    this.type = type;
  }
  
  public GoodType getType() {
	  return type;
  }

  public void addTrade(int id, SellerInfo seller, int amount, double pricePerUnit) {
	trades.add(new Trade(id, type, seller, amount, pricePerUnit));
  }
  
  public String generateTradeReport() {
	  String report = "!-- " + type + " --! \n";
	  for(Trade trade : trades) {
		 report += trade + "\n";
	  }
	  return report;
  }
}
