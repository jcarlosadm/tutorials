/*
 * ToyDuck.cpp
 *
 */

#include "../hpp_files/ToyDuck.hpp"

ToyDuck::ToyDuck(){
    flyBehavior = new FlyNoWay();
    quackBehavior = new MuteQuack();
}

ToyDuck::~ToyDuck(){}

void ToyDuck::notFly(){}
