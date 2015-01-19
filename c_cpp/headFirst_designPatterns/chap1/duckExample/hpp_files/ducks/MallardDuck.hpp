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
#include "../fly/FlyWithWings.hpp"
#include "../fly/FlyNoWay.hpp"
#include "../quack/Quack.hpp"
#include "../quack/MuteQuack.hpp"
#include "../quack/Squeak.hpp"

class MallardDuck : public Duck{
public:
    MallardDuck();
    ~MallardDuck();
    void notFly();
};



#endif /* MALLARDDUCK_HPP_ */
