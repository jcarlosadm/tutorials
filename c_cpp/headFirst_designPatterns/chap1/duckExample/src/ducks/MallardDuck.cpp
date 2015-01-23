/*
 * MallardDuck.cpp
 *
 */

#include "MallardDuck.hpp"

MallardDuck::MallardDuck(){
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
}

MallardDuck::~MallardDuck(){
    delete quackBehavior;
    delete flyBehavior;
}

void MallardDuck::notFly(){
    delete flyBehavior;
    flyBehavior = new FlyNoWay();
}
