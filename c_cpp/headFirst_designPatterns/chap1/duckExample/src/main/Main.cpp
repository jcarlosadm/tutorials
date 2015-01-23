/*
 * Main.cpp
 *
 */

#include <iostream>
#include <new>
using namespace std;

#include "../ducks/Duck.hpp"
#include "../ducks/MallardDuck.hpp"
#include "../ducks/ToyDuck.hpp"
#include "../ducks/WhiteDuck.hpp"

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

    // White Duck test
    Duck* whiteDuck = new WhiteDuck();
    cout<<"WhiteDuck test"<<endl;
    whiteDuck->performFly();
    whiteDuck->performQuack();
    cout<<endl;

    delete mallard;
    delete toy;
    delete whiteDuck;

    return 0;
}

