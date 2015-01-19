/*
 * MallardDuck.cpp
 *
 */

#include "../hpp_files/MallardDuck.hpp"

MallardDuck::MallardDuck(){
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
}

MallardDuck::~MallardDuck(){}

void MallardDuck::notFly(){
    delete flyBehavior;
    flyBehavior = new FlyNoWay();
}
