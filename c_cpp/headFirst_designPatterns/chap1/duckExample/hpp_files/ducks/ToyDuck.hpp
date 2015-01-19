/*
 * ToyDuck.hpp
 *
 *  Created on: 18/01/2015
 *      Author: jcarlos
 */

#ifndef TOYDUCK_HPP_
#define TOYDUCK_HPP_

#include <new>

#include "Duck.hpp"
#include "../fly/FlyWithWings.hpp"
#include "../fly/FlyNoWay.hpp"
#include "../quack/Quack.hpp"
#include "../quack/MuteQuack.hpp"
#include "../quack/Squeak.hpp"

class ToyDuck : public Duck{
public:
    ToyDuck();
    ~ToyDuck();
    void notFly();
};

#endif /* TOYDUCK_HPP_ */
