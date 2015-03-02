package br.com.pizza.ny;

import br.com.pizza.CheesePizza;
import br.com.pizza.ClamPizza;
import br.com.pizza.Pizza;
import br.com.pizza.PizzaStore;
import br.com.pizza.ingredient.PizzaIngredientFactory;
import br.com.pizza.ingredient.ny.NYPizzaIngredientFactory;

public class NYStylePizzaStore extends PizzaStore {
	
	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		
		if(type.equals("queijo")){
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Pizza de queijo estilo nova york");
		}
		else if(type.equals("mariscos")){
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Pizza de mariscos estilo nova york");
		}
		
		return pizza;
	}

}
