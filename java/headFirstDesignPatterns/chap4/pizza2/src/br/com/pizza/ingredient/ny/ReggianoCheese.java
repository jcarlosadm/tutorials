package br.com.pizza.ingredient.ny;

import br.com.pizza.ingredient.Cheese;

public class ReggianoCheese implements Cheese {

	private String name;
	
	public ReggianoCheese() {
		this.name = "Reggiano Cheese";
	}
	
	@Override
	public String getName() {
		return this.name;
	}

}
