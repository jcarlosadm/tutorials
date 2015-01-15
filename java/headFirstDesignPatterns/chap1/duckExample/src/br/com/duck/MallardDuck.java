package br.com.duck;

import br.com.duck.fly.FlyNoWay;
import br.com.duck.fly.FlyWithWings;
import br.com.duck.quack.Quack;

public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void notFly() {
        flyBehavior = new FlyNoWay();
    }
    
    
}
