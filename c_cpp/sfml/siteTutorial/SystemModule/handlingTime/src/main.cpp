/*
 * main.cpp
 *
 *  Created on: 01/02/2015
 *      Author: jcarlos
 */

#include <iostream>
#include <SFML/System.hpp>
#include <unistd.h>

using std::cout;
using std::endl;

int main(int argc, char **argv) {

    // test 1
    sf::Time t1 = sf::microseconds(10000);
    sf::Time t2 = sf::milliseconds(10);
    sf::Time t3 = sf::seconds(0.01);

    cout<<"test 1"<<endl;
    cout<<t1.asMilliseconds()<<" miliseconds"<<endl;
    cout<<t2.asMilliseconds()<<" miliseconds"<<endl;
    cout<<t3.asMilliseconds()<<" miliseconds"<<endl;

    // test 2
    sf::Time time = sf::seconds(2);

    sf::Int64 usec = time.asMicroseconds();
    sf::Int32 msec = time.asMilliseconds();
    float sec = time.asSeconds();

    cout<<endl<<"test 2"<<endl;
    cout<<usec<<" microseconds"<<endl;
    cout<<msec<<" milliseconds"<<endl;
    cout<<sec<<" seconds"<<endl;

    // test clock
    sf::Clock clock;
    sleep(2);
    cout<<endl<<clock.getElapsedTime().asSeconds()<<" seconds"<<endl;

    clock.restart();
    sleep(3);
    cout<<endl<<"restart"<<endl;
    cout<<clock.getElapsedTime().asSeconds()<<" seconds"<<endl;

    return 0;
}



