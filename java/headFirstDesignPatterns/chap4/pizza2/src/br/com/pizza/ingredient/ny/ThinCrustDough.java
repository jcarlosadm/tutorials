package br.com.pizza.ingredient.ny;

import br.com.pizza.ingredient.Dough;

public class ThinCrustDough implements Dough {

	private String name;
	
	public ThinCrustDough() {
		this.name = "Thin Crust Dough";
	}
	
	@Override
	public String getName() {
		return this.name;
	}

}
