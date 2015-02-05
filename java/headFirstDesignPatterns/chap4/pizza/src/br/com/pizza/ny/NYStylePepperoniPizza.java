package br.com.pizza.ny;

import br.com.pizza.Pizza;

public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza() {
        this.name = "NY Pepperoni Pizza";
        this.dough = "NY Dough";
        this.sauce = "NY Sauce";
        
        this.toppings.add("NY toppings");
    }
}
