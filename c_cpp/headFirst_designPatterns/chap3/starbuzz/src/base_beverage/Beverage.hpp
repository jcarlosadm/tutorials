/*
 * Beverage.hpp
 *
 */

#ifndef BEVERAGE_HPP_
#define BEVERAGE_HPP_

#include <string>
using std::string;

namespace starbuzz {
namespace base_beverage {

class Beverage {
protected:
    string description;

public:
    Beverage();
    virtual ~Beverage();
    virtual const char* getDescription();
    virtual double getCost()=0;
};

} /* namespace base_beverage */
} /* namespace starbuzz */

#endif /* BEVERAGE_HPP_ */
