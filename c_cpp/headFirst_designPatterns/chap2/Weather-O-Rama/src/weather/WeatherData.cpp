/*
 * WeatherData.cpp
 *
 */

#include "WeatherData.hpp"

namespace weather{

WeatherData::WeatherData(float temp, float pres, float hum) {
    temperature = temp;
    pressure = pres;
    humidity = hum;
}

WeatherData::~WeatherData() {}

void WeatherData::addObserver(Object* observer){

    Observer* observerData = dynamic_cast<Observer*>(observer);
    if(observerData == 0)
        return;

    list<Observer*>::iterator it;
    for(it=observers.begin(); it!=observers.end();it++){
        if((*it) == observerData){
            return;
        }
    }
    observers.push_front(observerData);
}

void WeatherData::removeObserver(Object* observer){

    Observer* observerData = dynamic_cast<Observer*>(observer);
    if(observerData == 0)
        return;

    list<Observer*>::iterator it;
    for(it=observers.begin(); it!=observers.end();it++){
        if((*it) == observerData){
            it = observers.erase(it);
            return;
        }
    }
}

void WeatherData::notifyObservers(){
    list<Observer*>::iterator it;
    for(it=observers.begin(); it!=observers.end(); it++){
        (*it)->update(this);
    }
}

void WeatherData::measurementsChanged(){
    notifyObservers();
}

void WeatherData::setMeasurements(float temp, float hum, float pres){
    temperature = temp;
    humidity = hum;
    pressure = pres;
    measurementsChanged();
}

float WeatherData::getTemperature(){
    return temperature;
}

float WeatherData::getHumidity(){
    return humidity;
}

float WeatherData::getPressure(){
    return pressure;
}
}
