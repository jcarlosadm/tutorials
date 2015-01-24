/*
 * Expresso.cpp
 *
 *  Created on: 24/01/2015
 *      Author: jcarlos
 */

#include "Expresso.hpp"

namespace starbuzz {
namespace base_beverage {

Expresso::Expresso() {
    this->description = "Expresso";
}

Expresso::~Expresso() {}

double Expresso::getCost(){
    return 1.99;
}

} /* namespace base_beverage */
} /* namespace starbuzz */
