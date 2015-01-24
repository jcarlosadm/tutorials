/*
 * Mocha.hpp
 *
 *  Created on: 24/01/2015
 *      Author: jcarlos
 */

#ifndef MOCHA_HPP_
#define MOCHA_HPP_

#include "CondimentDecorator.hpp"

namespace starbuzz {
namespace options {

class Mocha: public CondimentDecorator {
protected:
    Beverage* beverage;

public:
    Mocha(Beverage* beverage);
    virtual ~Mocha();
    const char* getDescription();
    double getCost();
};

} /* namespace options */
} /* namespace starbuzz */

#endif /* MOCHA_HPP_ */
