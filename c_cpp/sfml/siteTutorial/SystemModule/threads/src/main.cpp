/*
 * main.cpp
 *
 *  Created on: 01/02/2015
 *      Author: jcarlos
 */

#include <iostream>
#include <SFML/System.hpp>

using std::cout;
using std::endl;

sf::Mutex mutex;

void func(int value){

    // faz esse thread esperar 1 segundo
    // sf::sleep(sf::seconds(1));

    sf::Lock lock(mutex); // mutex lock

    for(int i=0; i<50; i++)
        cout<<"I'm thread number one with parameter "<<value<<endl;

} // mutex unlock

int main(int argc, char **argv) {

    sf::Thread thread(&func, 5);

    thread.launch();

    // faz com que espere o thread terminar primeiro
    // thread.wait();

    sf::Lock lock(mutex); // mutex lock

    for(int i=0; i<50; i++)
        cout<<"I'm main thread"<<endl;

    return 0; // mutex unlock
}
