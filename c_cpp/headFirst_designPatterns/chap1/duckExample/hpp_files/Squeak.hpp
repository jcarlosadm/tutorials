/*
 * Squeak.hpp
 *
 *  Created on: 18/01/2015
 *      Author: jcarlos
 */

#ifndef SQUEAK_HPP_
#define SQUEAK_HPP_

#include "QuackBehavior.hpp"

class Squeak : public QuackBehavior {
public:
    Squeak();
    ~Squeak();
    void quack();
};

#endif /* SQUEAK_HPP_ */
