/*
 * WhiteDuck.hpp
 *
 */

#ifndef WHITEDUCK_HPP_
#define WHITEDUCK_HPP_

#include <new>

#include "Duck.hpp"
#include "../fly/FlyWithWings.hpp"
#include "../fly/FlyNoWay.hpp"
#include "../quack/Quack.hpp"
#include "../quack/MuteQuack.hpp"
#include "../quack/Squeak.hpp"

class WhiteDuck: public Duck {
public:
    WhiteDuck();
    virtual ~WhiteDuck();
    void notFly();
};

#endif /* WHITEDUCK_HPP_ */
