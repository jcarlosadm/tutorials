#include <iostream>
#include <string>
#include <new>

using namespace std;

// abstract class
class FlyBehavior {
    public:
    virtual ~FlyBehavior(){}; // call destructor base class!
    void virtual fly(string name)=0; // <== this turn this class in abstract class!
};

class FlyWithWings: public FlyBehavior {
    public:
    ~FlyWithWings(){
        cout<<"bye!"<<endl; //working?
    }
    void fly(string name){
        cout<<"I'm flying!"<<endl;
        cout<<name<<endl; // data!!
    }
};

class FlyNoWay: public FlyBehavior {
    public:
    ~FlyNoWay(){
        cout<<"bye2!"<<endl; // working?
    }
    void fly(string name){
        cout<<"I don't fly..."<<endl;
        cout<<name<<"..."<<endl;
    }
};

class Duck {
    public:
    Duck(){
        name = "J Carlos";
        fly = new FlyWithWings;
    }
    
    ~Duck(){
        delete fly; // no dynamic_cast!!
    }
    
    void execFly(){
        fly->fly(name);
    }
    
    void flyNoMore(){
        delete fly;
        fly = new FlyNoWay;
    }
    
    void flyAgain(){
        delete fly;
        fly = new FlyWithWings;
    }
    
    private:
    string name;
    FlyBehavior* fly; // pointer for FlyBehavior!! dynamic behavior!!
};

int main(){
    
    Duck d;
    d.execFly();
    d.flyNoMore();
    d.execFly();
    d.flyAgain();
    d.execFly();
    
    return 0;
    
}
