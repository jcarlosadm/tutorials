/*
 * Duck.cpp
 *
 */

#include "Duck.hpp"

namespace ducks{

Duck::Duck(){
    flyBehavior = NULL;
    quackBehavior = NULL;
}

Duck::~Duck(){}

void Duck::performFly(){
    flyBehavior->fly();
}

void Duck::performQuack(){
    quackBehavior->quack();
}

} // namespace ducks //
