/*
 * MuteQuack.hpp
 *
 *  Created on: 18/01/2015
 *      Author: jcarlos
 */

#ifndef MUTEQUACK_HPP_
#define MUTEQUACK_HPP_

#include "QuackBehavior.hpp"

class MuteQuack : public QuackBehavior{
public:
    MuteQuack();
    ~MuteQuack();
    void quack();
};


#endif /* MUTEQUACK_HPP_ */
