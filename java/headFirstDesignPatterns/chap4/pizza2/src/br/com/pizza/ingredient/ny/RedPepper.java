package br.com.pizza.ingredient.ny;

import br.com.pizza.ingredient.Veggies;

public class RedPepper implements Veggies {

	private String name;
	
	public RedPepper() {
		this.name = "Red Pepper";
	}
	
	@Override
	public String getName() {
		return this.name;
	}

}
