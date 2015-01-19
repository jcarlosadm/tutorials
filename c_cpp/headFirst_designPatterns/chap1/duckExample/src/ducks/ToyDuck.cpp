/*
 * ToyDuck.cpp
 *
 */

#include "ToyDuck.hpp"

ToyDuck::ToyDuck(){
    flyBehavior = new FlyNoWay();
    quackBehavior = new MuteQuack();
}

ToyDuck::~ToyDuck(){}

void ToyDuck::notFly(){}
