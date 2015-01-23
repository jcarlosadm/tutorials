/*
 * ToyDuck.cpp
 *
 */

#include "ToyDuck.hpp"

namespace ducks{

ToyDuck::ToyDuck(){
    flyBehavior = new fly::FlyNoWay();
    quackBehavior = new quack::MuteQuack();
}

ToyDuck::~ToyDuck(){
    delete flyBehavior;
    delete quackBehavior;
}

void ToyDuck::notFly(){}

}
