/*
 * Milk.hpp
 *
 *  Created on: 24/01/2015
 *      Author: jcarlos
 */

#ifndef MILK_HPP_
#define MILK_HPP_

#include "CondimentDecorator.hpp"

namespace starbuzz {
namespace options {

class Milk: public CondimentDecorator {
protected:
    Beverage* beverage;

public:
    Milk(Beverage* beverage);
    virtual ~Milk();
    const char* getDescription();
    double getCost();
};

} /* namespace options */
} /* namespace starbuzz */

#endif /* MILK_HPP_ */
