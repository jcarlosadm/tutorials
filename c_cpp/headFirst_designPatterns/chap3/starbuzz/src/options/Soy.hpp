/*
 * Soy.hpp
 *
 *  Created on: 24/01/2015
 *      Author: jcarlos
 */

#ifndef SOY_HPP_
#define SOY_HPP_

#include "CondimentDecorator.hpp"

namespace starbuzz {
namespace options {

class Soy: public CondimentDecorator {
protected:
    Beverage* beverage;

public:
    Soy(Beverage* beverage);
    virtual ~Soy();
    const char* getDescription();
    double getCost();
};

} /* namespace options */
} /* namespace starbuzz */

#endif /* SOY_HPP_ */
