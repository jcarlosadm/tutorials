/*
 * FlyNoWay.hpp
 *
 */

#ifndef FLYNOWAY_HPP_
#define FLYNOWAY_HPP_

#include "FlyBehavior.hpp"
namespace fly{
class FlyNoWay : public FlyBehavior{
public:
    FlyNoWay();
    ~FlyNoWay();
    void fly();
};
};

#endif /* FLYNOWAY_HPP_ */
