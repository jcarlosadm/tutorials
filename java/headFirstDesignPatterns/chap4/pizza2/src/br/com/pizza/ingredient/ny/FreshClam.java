package br.com.pizza.ingredient.ny;

import br.com.pizza.ingredient.Clam;

public class FreshClam implements Clam {

	private String name;
	
	public FreshClam() {
		this.name = "Fresh Clam";
	}
	
	@Override
	public String getName() {
		return this.name;
	}

}
