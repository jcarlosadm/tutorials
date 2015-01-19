/*
 * ToyDuck.cpp
 *
 */

#include "../../hpp_files/ducks/ToyDuck.hpp"

ToyDuck::ToyDuck(){
    flyBehavior = new FlyNoWay();
    quackBehavior = new MuteQuack();
}

ToyDuck::~ToyDuck(){}

void ToyDuck::notFly(){}
