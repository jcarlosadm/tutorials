/*
 * Coffee.hpp
 *
 *  Created on: 24/01/2015
 *      Author: jcarlos
 */

#ifndef COFFEE_HPP_
#define COFFEE_HPP_

#include "Beverage.hpp"

namespace starbuzz {
namespace base_beverage {

class Coffee: public Beverage {
public:
    Coffee();
    virtual ~Coffee();
    double getCost();
};

} /* namespace base_beverage */
} /* namespace starbuzz */

#endif /* COFFEE_HPP_ */
