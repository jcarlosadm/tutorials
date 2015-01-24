/*
 * Descaffeinated.hpp
 *
 *  Created on: 24/01/2015
 *      Author: jcarlos
 */

#ifndef DESCAFFEINATED_HPP_
#define DESCAFFEINATED_HPP_

#include "Beverage.hpp"

namespace starbuzz {
namespace base_beverage {

class Descaffeinated: public Beverage {
public:
    Descaffeinated();
    virtual ~Descaffeinated();
    double getCost();
};

} /* namespace base_beverage */
} /* namespace starbuzz */

#endif /* DESCAFFEINATED_HPP_ */
