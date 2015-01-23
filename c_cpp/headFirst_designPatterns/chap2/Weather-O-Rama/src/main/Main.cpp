/*
 * Main.cpp
 *
 */

#include <iostream>
using namespace std;

#include "../weather/WeatherData.hpp"
#include "../weather/CurrentConditionDisplay.hpp"

int main(int argc, char **argv) {
    WeatherData weatherdata(0,0,0);

    CurrentConditionDisplay current1("julius");
    CurrentConditionDisplay current2("jonas");
    CurrentConditionDisplay current3("rebeca");

    weatherdata.addObserver(&current1);
    weatherdata.addObserver(&current2);
    weatherdata.addObserver(&current3);
    weatherdata.addObserver(&current1);
    weatherdata.removeObserver(&current2);

    weatherdata.setMeasurements(80, 65, 30.4);
    weatherdata.setMeasurements(82, 70, 29.2);
    weatherdata.setMeasurements(78, 90, 29.2);

    return 0;
}

