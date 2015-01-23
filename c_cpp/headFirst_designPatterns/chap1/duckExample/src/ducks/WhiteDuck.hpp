/*
 * WhiteDuck.hpp
 *
 */

#ifndef WHITEDUCK_HPP_
#define WHITEDUCK_HPP_

#include <new>

#include "Duck.hpp"
#include "../fly_behavior/FlyWithWings.hpp"
#include "../fly_behavior/FlyNoWay.hpp"
#include "../quack_behavior/Quack.hpp"
#include "../quack_behavior/MuteQuack.hpp"
#include "../quack_behavior/Squeak.hpp"

namespace ducks{

class WhiteDuck: public Duck {
public:
    WhiteDuck();
    virtual ~WhiteDuck();
    void notFly();
};

}

#endif /* WHITEDUCK_HPP_ */
