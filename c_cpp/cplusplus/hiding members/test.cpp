#include "test.h"

struct Person::Data {
    int id;
};

Person::Person(){
    myData = new Data;
    myData->id = 55;
}

Person::~Person(){
    delete myData;
}

void Person::hi(){
    cout<<myData->id<<endl;
    (myData->id)++;
}


