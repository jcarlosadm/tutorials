/*
 * HouseBlend.cpp
 *
 *  Created on: 24/01/2015
 *      Author: jcarlos
 */

#include "HouseBlend.hpp"

namespace starbuzz {
namespace base_beverage {

HouseBlend::HouseBlend() {
    this->description = "HouseBlend";
}

HouseBlend::~HouseBlend() {}

double HouseBlend::getCost(){
    return 0.89;
}

} /* namespace base_beverage */
} /* namespace starbuzz */
