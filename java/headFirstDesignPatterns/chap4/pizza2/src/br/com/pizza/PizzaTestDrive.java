package br.com.pizza;

import br.com.pizza.ny.NYStylePizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        
        Pizza pizza = nyStore.orderPizza("queijo");
        System.out.println("Ethan ordered a "+ pizza.getName() + "\n");
        System.out.println(pizza.toString());
        pizza = nyStore.orderPizza("mariscos");
        System.out.println("Joel ordered a "+ pizza.getName() + "\n");
        System.out.println(pizza.toString());
        
    }
}
