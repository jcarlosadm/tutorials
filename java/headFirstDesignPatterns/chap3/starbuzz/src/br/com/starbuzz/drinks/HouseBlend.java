package br.com.starbuzz.drinks;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "House Blend coffee";
    }
    
    @Override
    public double cost() {
        return .89;
    }

}
