/*
 * Mocha.cpp
 *
 *  Created on: 24/01/2015
 *      Author: jcarlos
 */

#include "Mocha.hpp"

namespace starbuzz {
namespace options {

Mocha::Mocha(Beverage* beverage) {
    this->beverage = beverage;
}

Mocha::~Mocha() {
    delete this->beverage;
}

const char* Mocha::getDescription(){
    string str = this->beverage->getDescription();
    str += ", Mocha";
    return str.c_str();
}

double Mocha::getCost(){
    return this->beverage->getCost()+0.20;
}

} /* namespace options */
} /* namespace starbuzz */
