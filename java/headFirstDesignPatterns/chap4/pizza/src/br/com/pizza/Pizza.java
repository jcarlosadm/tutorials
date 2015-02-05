package br.com.pizza;

import java.util.ArrayList;

public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    
    protected ArrayList<String> toppings = new ArrayList<String>();
    
    void prepare(){
        System.out.println("Preparing "+this.name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        
        for (String topping : toppings) {
            System.out.println(" "+topping);
        }
    }
    
    void bake(){
        System.out.println("bake for 25 minutes at 350");
    }
    
    protected void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
    
    protected void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }
    
    public String getName(){
        return this.name;
    }
}
