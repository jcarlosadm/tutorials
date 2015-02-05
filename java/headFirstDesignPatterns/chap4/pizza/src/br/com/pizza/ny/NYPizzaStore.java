package br.com.pizza.ny;

import br.com.pizza.Pizza;
import br.com.pizza.PizzaStore;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new NYStyleCheesePizza();
        }
        else if(type.equals("veggie")){
            return new NYStyleVeggiePizza();
        }
        else if(type.equals("clam")){
            return new NYStyleClamPizza();
        }
        else if(type.equals("pepperoni")){
            return new NYStylePepperoniPizza();
        }
        else
            return null;
    }

}
