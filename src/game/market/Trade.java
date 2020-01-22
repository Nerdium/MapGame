package game.market;

public class Trade {
  private int id;
  private GoodType type;
  private SellerInfo seller;
  private Timestamp timestamp;
  private int amount;
  private double pricePerUnit;
  
  public Trade(int id, GoodType type, SellerInfo seller, int amount, double pricePerUnit) {
	  this.id = id;
	  this.type = type;
	  this.seller = seller;
	  this.amount = amount;
	  this.pricePerUnit = pricePerUnit;
	  
	  timestamp = new Timestamp();
  }
  
  public String toString() {
	  return "Created by " + seller.getName() + " at " + timestamp + 
			  ": \n Good: " + type + 
			  "\n Amount: " + amount + 
			  "\n Price per unit: " + pricePerUnit + 
			  "\n ---------------------------------------- \n";
  }
}
