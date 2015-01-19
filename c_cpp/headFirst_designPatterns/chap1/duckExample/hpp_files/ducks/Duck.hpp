/*
 * Duck.hpp
 *
 */

#ifndef DUCK_HPP_
#define DUCK_HPP_

#include "../fly/FlyBehavior.hpp"
#include "../quack/QuackBehavior.hpp"

class Duck{
protected:
    FlyBehavior* flyBehavior;
    QuackBehavior* quackBehavior;
public:
    Duck();
    virtual ~Duck();
    void performFly();
    void performQuack();
    virtual void notFly()=0;
};

#endif /* DUCK_HPP_ */
