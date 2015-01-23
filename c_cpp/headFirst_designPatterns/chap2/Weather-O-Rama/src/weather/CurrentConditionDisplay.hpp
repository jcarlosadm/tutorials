/*
 * CurrentConditionDisplay.hpp
 *
 */

#ifndef CURRENTCONDITIONDISPLAY_HPP_
#define CURRENTCONDITIONDISPLAY_HPP_

#include <iostream>
#include <string>

#include "../observer_api/Observer.hpp"
#include "../observer_api/Observable.hpp"
#include "../observer_api/Object.hpp"
#include "DisplayElement.hpp"
#include "WeatherData.hpp"

using namespace observer_api;

namespace weather{

using std::cout;
using std::endl;
using std::string;

class CurrentConditionDisplay : public Observer, DisplayElement {

private:
    float temperature;
    float humidity;
    string myname;
public:
    CurrentConditionDisplay(const char* name);
    ~CurrentConditionDisplay();
    void display();
    void update(Object* obs);
};
}
#endif /* CURRENTCONDITIONDISPLAY_HPP_ */
