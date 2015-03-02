package br.com.pizza.ingredient.ny;

import br.com.pizza.ingredient.Pepperoni;

public class SlicedPepperoni implements Pepperoni {

	private String name;
	
	public SlicedPepperoni() {
		this.name = "Sliced Pepperoni";
	}
	
	@Override
	public String getName() {
		return this.name;
	}

}
