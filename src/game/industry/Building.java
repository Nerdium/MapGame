package game.industry;

import game.Identifiable;

public class Building implements Identifiable {
	private int id;
	
	public Building(int id) {
		this.id = id;
	}
	
	@Override
	public int getId() {
		return id;
	}

}
