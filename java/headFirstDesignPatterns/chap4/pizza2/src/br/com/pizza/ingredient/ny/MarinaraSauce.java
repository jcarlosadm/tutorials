package br.com.pizza.ingredient.ny;

import br.com.pizza.ingredient.Sauce;

public class MarinaraSauce implements Sauce {

	private String name;
	
	public MarinaraSauce() {
		this.name = "Marinara Sauce";
	}
	
	@Override
	public String getName() {
		return this.name;
	}

}
