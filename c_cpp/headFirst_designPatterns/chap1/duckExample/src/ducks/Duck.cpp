/*
 * Duck.cpp
 *
 */

#include "../../hpp_files/ducks/Duck.hpp"

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
