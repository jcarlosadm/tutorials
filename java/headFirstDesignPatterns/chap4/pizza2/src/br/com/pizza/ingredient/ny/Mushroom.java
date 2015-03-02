package br.com.pizza.ingredient.ny;

import br.com.pizza.ingredient.Veggies;

public class Mushroom implements Veggies {

	private String name;
	
	public Mushroom() {
		this.name = "Mushroom";
	}
	
	@Override
	public String getName() {
		return this.name;
	}

}
