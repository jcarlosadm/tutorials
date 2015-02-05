package br.com.pizza.ny;

import br.com.pizza.Pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        this.name = "NY Style Sauce and Cheese Pizza";
        this.dough = "Thin Crust Dough";
        this.sauce = "Marinara sauce";
        
        this.toppings.add("Grated Reggiano Cheese");
    }
}
