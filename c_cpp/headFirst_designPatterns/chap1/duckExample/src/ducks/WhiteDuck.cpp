/*
 * WhiteDuck.cpp
 *
 */

#include "WhiteDuck.hpp"

WhiteDuck::WhiteDuck() {
    flyBehavior = new FlyWithWings();
    quackBehavior = new Squeak();
}

WhiteDuck::~WhiteDuck() {}

void WhiteDuck::notFly(){}
