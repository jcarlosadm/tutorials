package br.com.pizza.chicago;

import br.com.pizza.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        this.name = "Pepperoni Pizza";
        this.dough = "Pepperoni Dough";
        this.sauce = "Pepperoni Sauce";
        
        this.toppings.add("Pepperoni toppings");
    }
}
