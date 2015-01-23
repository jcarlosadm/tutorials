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
#include "FlyWithWings.hpp"
#include "FlyNoWay.hpp"
#include "Quack.hpp"
#include "MuteQuack.hpp"
#include "Squeak.hpp"

namespace ducks{

class ToyDuck : public Duck{
public:
    ToyDuck();
    ~ToyDuck();
    void notFly();
};

};

#endif /* TOYDUCK_HPP_ */
