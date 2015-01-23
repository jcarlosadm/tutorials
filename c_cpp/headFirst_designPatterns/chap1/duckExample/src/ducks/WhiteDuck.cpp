/*
 * WhiteDuck.cpp
 *
 */

#include "WhiteDuck.hpp"

WhiteDuck::WhiteDuck() {
    flyBehavior = new FlyWithWings();
    quackBehavior = new Squeak();
}

WhiteDuck::~WhiteDuck() {
    delete flyBehavior;
    delete quackBehavior;
}

void WhiteDuck::notFly(){}
