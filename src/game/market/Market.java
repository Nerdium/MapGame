package game.market;

public class Market {
  private int idCounter = 1;
  private ArrayList<MarketList> marketLists = new ArrayList<MarketList>();

  public Market() {
    for(GoodType type : GoodType.values()) {
      marketLists.add(new MarketList(type));
    }
  }

  public int getNextId() {
    idCounter++;
    return idCounter - 1;
  }
}
