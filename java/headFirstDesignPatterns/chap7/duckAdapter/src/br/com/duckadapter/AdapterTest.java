package br.com.duckadapter;

import br.com.duckadapter.duck.Duck;
import br.com.duckadapter.duck.MallardDuck;
import br.com.duckadapter.turkey.Turkey;
import br.com.duckadapter.turkey.WildTurkey;

public class AdapterTest {
    public static void main(String[] args) {
        Turkey wildTurkey = new WildTurkey();
        Duck mallardDuck = new MallardDuck();
        
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
        
        System.out.println("Mallard Duck:");
        mallardDuck.quack();
        mallardDuck.fly();
        
        System.out.println("\nWild Turkey:");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
