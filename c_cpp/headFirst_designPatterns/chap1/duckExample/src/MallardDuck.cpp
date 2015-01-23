/*
 * MallardDuck.cpp
 *
 */

#include "MallardDuck.hpp"

namespace ducks{

MallardDuck::MallardDuck(){
    quackBehavior = new quack::Quack();
    flyBehavior = new fly::FlyWithWings();
}

MallardDuck::~MallardDuck(){
    delete quackBehavior;
    delete flyBehavior;
}

void MallardDuck::notFly(){
    delete flyBehavior;
    flyBehavior = new fly::FlyNoWay();
}

};
