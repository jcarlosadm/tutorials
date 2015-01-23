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
#include "../fly_behavior/FlyWithWings.hpp"
#include "../fly_behavior/FlyNoWay.hpp"
#include "../quack_behavior/Quack.hpp"
#include "../quack_behavior/MuteQuack.hpp"
#include "../quack_behavior/Squeak.hpp"

namespace ducks{

class ToyDuck : public Duck{
public:
    ToyDuck();
    ~ToyDuck();
    void notFly();
};

}

#endif /* TOYDUCK_HPP_ */
