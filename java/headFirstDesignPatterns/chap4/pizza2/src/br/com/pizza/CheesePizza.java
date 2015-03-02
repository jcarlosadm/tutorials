package br.com.pizza;

import br.com.pizza.ingredient.PizzaIngredientFactory;

public class CheesePizza extends Pizza{

	PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	@Override
	protected void prepare() {
		System.out.println("Preparing "+this.name);
		this.dough = this.ingredientFactory.createDough();
		this.sauce = this.ingredientFactory.createSauce();
		this.cheese = this.ingredientFactory.createCheese();
	}

}
