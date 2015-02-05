package br.com.pizza.ny;

import br.com.pizza.Pizza;

public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza() {
        this.name = "NY Clam Pizza";
        this.dough = "Clam Dough";
        this.sauce = "Clam Sauce";
        
        this.toppings.add("Clam toppings");
    }
}
