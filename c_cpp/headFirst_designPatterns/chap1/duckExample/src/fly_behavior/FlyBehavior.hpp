/*
 * FlyBehavior.hpp
 *
 */

#ifndef FLYBEHAVIOR_HPP_
#define FLYBEHAVIOR_HPP_

#include <iostream>
using namespace std;

namespace fly{

class FlyBehavior{
public:
    FlyBehavior();
    virtual ~FlyBehavior();
    virtual void fly()=0;
};
}

#endif /* FLYBEHAVIOR_HPP_ */
