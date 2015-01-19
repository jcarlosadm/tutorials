/*
 * QuackBehavior.hpp
 *
 *  Created on: 18/01/2015
 *      Author: jcarlos
 */

#ifndef QUACKBEHAVIOR_HPP_
#define QUACKBEHAVIOR_HPP_

#include <iostream>
using namespace std;

class QuackBehavior{
public:
    QuackBehavior();
    virtual ~QuackBehavior();
    virtual void quack()=0;
};


#endif /* QUACKBEHAVIOR_HPP_ */
