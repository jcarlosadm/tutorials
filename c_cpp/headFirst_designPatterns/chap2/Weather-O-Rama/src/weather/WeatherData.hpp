/*
 * WeatherData.hpp
 *
 */

#ifndef WEATHERDATA_HPP_
#define WEATHERDATA_HPP_

#include <iostream>
#include <list>

#include "../observer_api/Observable.hpp"
#include "../observer_api/Observer.hpp"
#include "../observer_api/Object.hpp"

using namespace observer_api;
using std::list;

namespace weather{

class WeatherData : public Observable {

private:
    list<Observer*> observers;
    float temperature;
    float humidity;
    float pressure;
public:
    WeatherData(float temp, float pres, float hum);
    virtual ~WeatherData();
    void addObserver(Object* observer);
    void removeObserver(Object* observer);
    void notifyObservers();
    void measurementsChanged();
    void setMeasurements(float temp, float hum, float pres);
    float getTemperature();
    float getHumidity();
    float getPressure();
};
}
#endif /* WEATHERDATA_HPP_ */
