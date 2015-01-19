/*
 * Main.cpp
 *
 */

#include <iostream>
#include <new>
using namespace std;

#include "../hpp_files/Duck.hpp"
#include "../hpp_files/MallardDuck.hpp"
#include "../hpp_files/ToyDuck.hpp"

int main(int argc, char **argv) {

    // Mallard Duck Test
    Duck* mallard = new MallardDuck();
    cout<<"Mallard Duck test"<<endl;
    mallard->performFly();
    mallard->performQuack();
    cout<<endl;

    // Mallard Duck Test with notFly
    mallard->notFly();
    cout<<"Mallard with not fly"<<endl;
    mallard->performFly();
    mallard->performQuack();
    cout<<endl;

    // ToyDuck Test
    Duck* toy = new ToyDuck();
    cout<<"Toy Test"<<endl;
    toy->performFly();
    toy->performQuack();
    cout<<endl;
}

