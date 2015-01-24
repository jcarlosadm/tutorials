/*
 * Descaffeinated.cpp
 *
 *  Created on: 24/01/2015
 *      Author: jcarlos
 */

#include "Descaffeinated.hpp"

namespace starbuzz {
namespace base_beverage {

Descaffeinated::Descaffeinated() {
    this->description = "Descaffeinated";
}

Descaffeinated::~Descaffeinated() {}

double Descaffeinated::getCost(){
    return 1.05;
}

} /* namespace base_beverage */
} /* namespace starbuzz */
