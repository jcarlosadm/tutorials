package br.com.pizza.ny;

import br.com.pizza.Pizza;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        this.name = "NY Veggie Pizza";
        this.dough = "Veggie Dough";
        this.sauce = "Veggie Sauce";
        
        this.toppings.add("Veggie toppings");
    }
}
