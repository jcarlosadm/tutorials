package br.com.starbuzz.util;

import br.com.starbuzz.drinks.Beverage;
import br.com.starbuzz.drinks.Coffee;
import br.com.starbuzz.drinks.Expresso;
import br.com.starbuzz.drinks.HouseBlend;
import br.com.starbuzz.drinks.Milk;
import br.com.starbuzz.drinks.Mocha;
import br.com.starbuzz.drinks.Soy;
import br.com.starbuzz.drinks.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Expresso();
        System.out.println(beverage.getDescription()
                + " $"+beverage.cost());
        
        Beverage beverage2 = new Coffee();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        
        System.out.println(beverage2.getDescription()+ " $"
                + beverage2.cost());
        
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Milk(beverage3);
        System.out.println(beverage3.getDescription()+
                " $"+beverage3.cost());
    }
}
