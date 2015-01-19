/*
 * Quack.hpp
 *
 *  Created on: 18/01/2015
 *      Author: jcarlos
 */

#ifndef QUACK_HPP_
#define QUACK_HPP_

#include "QuackBehavior.hpp"

class Quack : public QuackBehavior{
public:
    Quack();
    ~Quack();
    void quack();
};

#endif /* QUACK_HPP_ */
