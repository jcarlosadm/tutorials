package br.com.pizza.ingredient.ny;

import br.com.pizza.ingredient.Veggies;

public class Garlic implements Veggies {

	private String name;
	
	public Garlic() {
		this.name = "Garlic";
	}
	
	@Override
	public String getName() {
		return this.name;
	}

}
