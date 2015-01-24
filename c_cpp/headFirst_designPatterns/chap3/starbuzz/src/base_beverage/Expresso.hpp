/*
 * Expresso.hpp
 *
 *  Created on: 24/01/2015
 *      Author: jcarlos
 */

#ifndef EXPRESSO_HPP_
#define EXPRESSO_HPP_

#include "Beverage.hpp"

namespace starbuzz {
namespace base_beverage {

class Expresso: public Beverage {
public:
    Expresso();
    virtual ~Expresso();
    double getCost();
};

} /* namespace base_beverage */
} /* namespace starbuzz */

#endif /* EXPRESSO_HPP_ */
