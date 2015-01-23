/*
 * Duck.hpp
 *
 */

#ifndef DUCK_HPP_
#define DUCK_HPP_

#include "../fly_behavior/FlyBehavior.hpp"
#include "../quack_behavior/QuackBehavior.hpp"

namespace ducks{

class Duck{
protected:
    fly::FlyBehavior* flyBehavior;
    quack::QuackBehavior* quackBehavior;
public:
    Duck();
    virtual ~Duck();
    void performFly();
    void performQuack();
    virtual void notFly()=0;
};

} // namespace ducks //

#endif /* DUCK_HPP_ */
