/*
 * Observer.hpp
 *
 */

#ifndef OBSERVER_HPP_
#define OBSERVER_HPP_

#include "Object.hpp"

class Observer: public Object {
public:
    Observer();
    virtual ~Observer();
    virtual void update(Object* observable)=0;
};

#endif /* OBSERVER_HPP_ */
