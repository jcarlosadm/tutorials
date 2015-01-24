/*
 * Beverage.cpp
 *
 */

#include "Beverage.hpp"

namespace starbuzz {
namespace base_beverage {

Beverage::Beverage() {
    this->description = "Unknow beverage";
}

Beverage::~Beverage() {}

const char* Beverage::getDescription(){
    return this->description.c_str();
}

} /* namespace base_beverage */
} /* namespace starbuzz */
