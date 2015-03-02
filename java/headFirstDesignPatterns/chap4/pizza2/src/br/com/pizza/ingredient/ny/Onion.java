package br.com.pizza.ingredient.ny;

import br.com.pizza.ingredient.Veggies;

public class Onion implements Veggies {

	private String name;
	
	public Onion() {
		this.name = "Onion";
	}
	
	@Override
	public String getName() {
		return this.name;
	}

}
