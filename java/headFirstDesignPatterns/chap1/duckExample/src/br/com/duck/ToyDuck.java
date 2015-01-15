package br.com.duck;

import br.com.duck.fly.FlyNoWay;
import br.com.duck.quack.MuteQuack;

public class ToyDuck extends Duck{
    public ToyDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void notFly() {}
}
