/*
 * CondimentDecorator.hpp
 *
 *  Created on: 24/01/2015
 *      Author: jcarlos
 */

#ifndef CONDIMENTDECORATOR_HPP_
#define CONDIMENTDECORATOR_HPP_

#include <iostream>
#include <new>
#include "../base_beverage/Beverage.hpp"
using starbuzz::base_beverage::Beverage;
using std::cout;
using std::endl;

namespace starbuzz {
namespace options {

class CondimentDecorator: public base_beverage::Beverage {
public:
    CondimentDecorator();
    virtual ~CondimentDecorator();
    virtual double getCost()=0;
};

} /* namespace options */
} /* namespace starbuzz */

#endif /* CONDIMENTDECORATOR_HPP_ */
