package br.com.pizza.chicago;

import br.com.pizza.Pizza;

public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        this.name = "Clam Pizza";
        this.dough = "Clam Dough";
        this.sauce = "Clam Sauce";
        
        this.toppings.add("Clam toppings");
    }
}
