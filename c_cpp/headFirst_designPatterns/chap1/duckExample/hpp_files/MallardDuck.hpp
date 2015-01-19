/*
 * MallardDuck.hpp
 *
 *  Created on: 18/01/2015
 *      Author: jcarlos
 */

#ifndef MALLARDDUCK_HPP_
#define MALLARDDUCK_HPP_

#include <new>

#include "Duck.hpp"
#include "FlyBehavior.hpp"
#include "FlyWithWings.hpp"
#include "FlyNoWay.hpp"
#include "QuackBehavior.hpp"
#include "Quack.hpp"
#include "MuteQuack.hpp"
#include "Squeak.hpp"

class MallardDuck : public Duck{
public:
    MallardDuck();
    ~MallardDuck();
    void notFly();
};



#endif /* MALLARDDUCK_HPP_ */
