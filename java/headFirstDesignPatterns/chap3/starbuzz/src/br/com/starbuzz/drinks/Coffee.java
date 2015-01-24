package br.com.starbuzz.drinks;

public class Coffee extends Beverage {

    public Coffee() {
        this.description = "Coffee";
    }
    
    @Override
    public double cost() {
        return .99;
    }

}
