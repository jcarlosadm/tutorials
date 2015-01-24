package br.com.starbuzz.drinks;

public class Milk extends CondimentDecorator {

    Beverage beverage;
    
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
    
    @Override
    public String getDescription() {
        return this.beverage.getDescription()+", Milk";
    }

    @Override
    public double cost() {
        return .10 + this.beverage.cost();
    }

}
