/*
 * WhiteDuck.cpp
 *
 */

#include "WhiteDuck.hpp"

namespace ducks{

WhiteDuck::WhiteDuck() {
    flyBehavior = new fly::FlyWithWings();
    quackBehavior = new quack::Squeak();
}

WhiteDuck::~WhiteDuck() {
    delete flyBehavior;
    delete quackBehavior;
}

void WhiteDuck::notFly(){}

}
