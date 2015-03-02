package br.com.pizza;

import br.com.pizza.ingredient.PizzaIngredientFactory;

public class ClamPizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;
	
	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	@Override
	protected void prepare() {
		System.out.println("Preparing "+ this.name);
		this.dough = this.ingredientFactory.createDough();
		this.sauce = this.ingredientFactory.createSauce();
		this.cheese = this.ingredientFactory.createCheese();
		this.clam = this.ingredientFactory.createClam();

	}

}
