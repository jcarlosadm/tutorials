/*
 * Observable.hpp
 *
 */

#ifndef OBSERVABLE_HPP_
#define OBSERVABLE_HPP_

#include "Object.hpp"

namespace observer_api{

class Observable: public Object {
public:
    Observable();
    virtual ~Observable();
    virtual void addObserver(Object* observer)=0;
    virtual void removeObserver(Object* observer)=0;
    virtual void notifyObservers()=0;
};
}
#endif /* OBSERVABLE_HPP_ */
