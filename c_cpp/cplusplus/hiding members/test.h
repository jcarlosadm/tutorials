#include <iostream>
#include <new>

using namespace std;

class Person {
    public:
    Person();
    ~Person();
    void hi();
    private:
    struct Data;
    Data* myData;
};
