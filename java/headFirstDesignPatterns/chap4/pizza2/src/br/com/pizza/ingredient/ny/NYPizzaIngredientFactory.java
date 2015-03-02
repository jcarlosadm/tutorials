package br.com.pizza.ingredient.ny;

import br.com.pizza.ingredient.Cheese;
import br.com.pizza.ingredient.Clam;
import br.com.pizza.ingredient.Dough;
import br.com.pizza.ingredient.Pepperoni;
import br.com.pizza.ingredient.PizzaIngredientFactory;
import br.com.pizza.ingredient.Sauce;
import br.com.pizza.ingredient.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVegies() {
		Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(),
				new RedPepper()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clam createClam() {
		return new FreshClam();
	}

}
