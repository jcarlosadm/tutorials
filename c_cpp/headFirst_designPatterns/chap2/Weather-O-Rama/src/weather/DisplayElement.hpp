/*
 * DisplayElement.hpp
 *
 */

#ifndef DISPLAYELEMENT_HPP_
#define DISPLAYELEMENT_HPP_

class DisplayElement {
public:
    DisplayElement();
    virtual ~DisplayElement();
    virtual void display()=0;
};

#endif /* DISPLAYELEMENT_HPP_ */
