package br.com.starbuzz.drinks;

public class Descaffeinated extends Beverage {

    public Descaffeinated() {
        this.description = "Descaffeinated";
    }
    
    @Override
    public double cost() {
        return 1.05;
    }

}
