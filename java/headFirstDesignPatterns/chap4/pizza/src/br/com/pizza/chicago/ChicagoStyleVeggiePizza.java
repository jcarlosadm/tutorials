package br.com.pizza.chicago;

import br.com.pizza.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        this.name = "Chicago Style Veggie Pizza";
        this.dough = "Veggie Dough";
        this.sauce = "Sauce";
        
        this.toppings.add("Veggie toppings");
    }
}
