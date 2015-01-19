/*
 * MallardDuck.cpp
 *
 */

#include "MallardDuck.hpp"

MallardDuck::MallardDuck(){
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
}

MallardDuck::~MallardDuck(){}

void MallardDuck::notFly(){
    delete flyBehavior;
    flyBehavior = new FlyNoWay();
}
