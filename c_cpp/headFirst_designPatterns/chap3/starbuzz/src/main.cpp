/*
 * main.cpp
 *
 *  Created on: 24/01/2015
 *      Author: jcarlos
 */

#include <iostream>
#include <new>
#include "base_beverage/Beverage.hpp"
#include "base_beverage/Expresso.hpp"
#include "base_beverage/Coffee.hpp"
#include "options/Milk.hpp"
#include "options/Mocha.hpp"
#include "options/Soy.hpp"

using std::cout;
using std::endl;
using starbuzz::base_beverage::Beverage;
using starbuzz::base_beverage::Expresso;
using starbuzz::base_beverage::Coffee;
using starbuzz::options::Milk;
using starbuzz::options::Mocha;
using starbuzz::options::Soy;

int main(int argc, char **argv) {

    Expresso expresso;
    cout<<expresso.getDescription()<<" $"<<expresso.getCost()<<endl;

    Beverage* myBeverage1 = new Coffee();
    myBeverage1 = new Mocha(myBeverage1);
    myBeverage1 = new Mocha(myBeverage1);
    myBeverage1 = new Milk(myBeverage1);
    cout<<myBeverage1->getDescription()<<" $"<<myBeverage1->getCost()<<endl;
    delete myBeverage1;

    Beverage* myBeverage2 = new Expresso();
    myBeverage2 = new Soy(myBeverage2);
    myBeverage2 = new Milk(myBeverage2);
    cout<<myBeverage2->getDescription()<<" $"<<myBeverage2->getCost()<<endl;
    delete myBeverage2;

    return 0;
}

