/*
 * Coffee.cpp
 *
 *  Created on: 24/01/2015
 *      Author: jcarlos
 */

#include "Coffee.hpp"

namespace starbuzz {
namespace base_beverage {

Coffee::Coffee() {
    this->description = "Coffee";
}

Coffee::~Coffee() {}

double Coffee::getCost(){
    return 0.99;
}

} /* namespace base_beverage */
} /* namespace starbuzz */
