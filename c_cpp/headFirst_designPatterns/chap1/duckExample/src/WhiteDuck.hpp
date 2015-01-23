/*
 * WhiteDuck.hpp
 *
 */

#ifndef WHITEDUCK_HPP_
#define WHITEDUCK_HPP_

#include <new>

#include "Duck.hpp"
#include "FlyWithWings.hpp"
#include "FlyNoWay.hpp"
#include "Quack.hpp"
#include "MuteQuack.hpp"
#include "Squeak.hpp"

namespace ducks{

class WhiteDuck: public Duck {
public:
    WhiteDuck();
    virtual ~WhiteDuck();
    void notFly();
};

};

#endif /* WHITEDUCK_HPP_ */
