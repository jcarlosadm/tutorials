/*
 * ToyDuck.cpp
 *
 */

#include "ToyDuck.hpp"

ToyDuck::ToyDuck(){
    flyBehavior = new FlyNoWay();
    quackBehavior = new MuteQuack();
}

ToyDuck::~ToyDuck(){
    delete flyBehavior;
    delete quackBehavior;
}

void ToyDuck::notFly(){}
