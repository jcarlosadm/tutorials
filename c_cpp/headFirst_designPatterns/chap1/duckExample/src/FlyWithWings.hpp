/*
 * FlyWithWings.hpp
 *
 */

#ifndef FLYWITHWINGS_HPP_
#define FLYWITHWINGS_HPP_

#include "FlyBehavior.hpp"
namespace fly{
class FlyWithWings : public FlyBehavior{
public:
    FlyWithWings();
    ~FlyWithWings();
    void fly();
};
}

#endif /* FLYWITHWINGS_HPP_ */
