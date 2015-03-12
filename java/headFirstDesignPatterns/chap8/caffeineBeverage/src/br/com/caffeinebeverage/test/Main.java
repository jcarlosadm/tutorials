package br.com.caffeinebeverage.test;

import br.com.caffeinebeverage.Coffee;
import br.com.caffeinebeverage.Tea;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();
        
        coffee.prepareRecipe();
        System.out.println("\n");
        tea.prepareRecipe();
    }
    
}
