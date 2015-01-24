/*
 * HouseBlend.hpp
 *
 *  Created on: 24/01/2015
 *      Author: jcarlos
 */

#ifndef HOUSEBLEND_HPP_
#define HOUSEBLEND_HPP_

#include "Beverage.hpp"

namespace starbuzz {
namespace base_beverage {

class HouseBlend: public Beverage {
public:
    HouseBlend();
    virtual ~HouseBlend();
    double getCost();
};

} /* namespace base_beverage */
} /* namespace starbuzz */

#endif /* HOUSEBLEND_HPP_ */
