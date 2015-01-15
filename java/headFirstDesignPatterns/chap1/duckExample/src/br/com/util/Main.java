package br.com.util;

import br.com.duck.Duck;
import br.com.duck.MallardDuck;
import br.com.duck.ToyDuck;

public class Main {
    public static void main(String[] args) {
        // MallardDuck test
        Duck mallard = new MallardDuck();
        System.out.println("mallard test");
        mallard.performFly();
        mallard.performQuack();
        System.out.println("");
        
        // MallarDuck test with notFly()
        mallard.notFly();
        System.out.println("mallard not fly test");
        mallard.performFly();
        mallard.performQuack();
        System.out.println("");
        
        // ToyDuck test
        Duck toy = new ToyDuck();
        System.out.println("toy test");
        toy.performFly();
        toy.performQuack();
        System.out.println("");
    }
}
