package game.industry;

import game.Entity;
import game.market.GoodType;

public class Factory extends Building implements Entity {

	private boolean active;
	private GoodType input;
	private GoodType output;
	
	
	public Factory(int id) {
		super(id);
		active = false;
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
