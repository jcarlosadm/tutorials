/*
 * Milk.cpp
 *
 *  Created on: 24/01/2015
 *      Author: jcarlos
 */

#include "Milk.hpp"

namespace starbuzz {
namespace options {

Milk::Milk(Beverage* beverage) {
    this->beverage = beverage;
}

Milk::~Milk() {
    delete this->beverage;
}

const char* Milk::getDescription(){
    string str = this->beverage->getDescription();
    str += ", Milk";
    return str.c_str();
}

double Milk::getCost(){
    return this->beverage->getCost() + 0.10;
}

} /* namespace options */
} /* namespace starbuzz */
