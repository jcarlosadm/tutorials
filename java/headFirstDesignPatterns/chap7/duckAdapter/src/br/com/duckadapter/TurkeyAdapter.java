package br.com.duckadapter;

import br.com.duckadapter.duck.Duck;
import br.com.duckadapter.turkey.Turkey;

public class TurkeyAdapter implements Duck {

    Turkey turkey;
    
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }
    
    @Override
    public void quack() {
        this.turkey.gobble();
    }

    @Override
    public void fly() {
        this.turkey.fly();
    }
}
