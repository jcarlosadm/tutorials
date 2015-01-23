/*
 * Main.cpp
 *
 */

#include <iostream>
#include <new>
using namespace std;

#include "ducks/Duck.hpp"
#include "ducks/MallardDuck.hpp"
#include "ducks/ToyDuck.hpp"
#include "ducks/WhiteDuck.hpp"

int main(int argc, char **argv) {

    // Mallard Duck Test
    ducks::Duck* mallard = new ducks::MallardDuck();
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
    ducks::Duck* toy = new ducks::ToyDuck();
    cout<<"Toy Test"<<endl;
    toy->performFly();
    toy->performQuack();
    cout<<endl;

    // White Duck test
    ducks::Duck* whiteDuck = new ducks::WhiteDuck();
    cout<<"WhiteDuck test"<<endl;
    whiteDuck->performFly();
    whiteDuck->performQuack();
    cout<<endl;

    delete mallard;
    delete toy;
    delete whiteDuck;

    return 0;
}

