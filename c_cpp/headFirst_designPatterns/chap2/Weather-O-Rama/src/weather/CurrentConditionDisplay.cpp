/*
 * CurrentConditionDisplay.cpp
 *
 */

#include "CurrentConditionDisplay.hpp"

CurrentConditionDisplay::CurrentConditionDisplay(const char* name) {
    temperature = 0;
    humidity = 0;
    myname = name;
}

CurrentConditionDisplay::~CurrentConditionDisplay() {}

void CurrentConditionDisplay::display(){
    cout<<myname<<">> Current conditions: ";
    cout<<temperature<<"F degrees and "<<humidity<<"% humidity"<<endl;
}

void CurrentConditionDisplay::update(Object* obs){
    WeatherData* data = dynamic_cast<WeatherData*>(obs);
    if(data != 0){
        temperature = data->getTemperature();
        humidity = data->getHumidity();
        display();
    }
}
