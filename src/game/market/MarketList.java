package game.market;

import java.util.ArrayList;

public class MarketList {
  private GoodType type;
  private ArrayList<Trade> trade = new ArrayList<Trade>();
  public MarketList(GoodType type) {
    this.type = type;
  }
}
