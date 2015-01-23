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
#include "../fly_behavior/FlyWithWings.hpp"
#include "../fly_behavior/FlyNoWay.hpp"
#include "../quack_behavior/Quack.hpp"
#include "../quack_behavior/MuteQuack.hpp"
#include "../quack_behavior/Squeak.hpp"

namespace ducks{

class MallardDuck : public Duck{
public:
    MallardDuck();
    ~MallardDuck();
    void notFly();
};

}

#endif /* MALLARDDUCK_HPP_ */
