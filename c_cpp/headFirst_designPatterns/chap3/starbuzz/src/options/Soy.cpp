/*
 * Soy.cpp
 *
 *  Created on: 24/01/2015
 *      Author: jcarlos
 */

#include "Soy.hpp"

namespace starbuzz {
namespace options {

Soy::Soy(Beverage* beverage) {
    this->beverage = beverage;
}

Soy::~Soy() {
    delete beverage;
}

const char* Soy::getDescription(){
    string str = this->beverage->getDescription();
    str += ", Soy";
    return str.c_str();
}

double Soy::getCost(){
    return this->beverage->getCost() + 0.15;
}

} /* namespace options */
} /* namespace starbuzz */
