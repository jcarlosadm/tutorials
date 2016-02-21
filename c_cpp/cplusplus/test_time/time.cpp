#include<iostream>
#include<ctime>

using namespace std;

int main(){
    
    time_t base = time(0);
    time_t base2 = time(0);
    
    base2+=(1.5*60*60*24*30*12);
    
    cout<<"base1: "<<ctime(&base)<<endl;
    cout<<"base2: "<<ctime(&base2)<<endl;
    
    cout<<"diff: "<<(difftime(base2,base)/(1*60*60*24*30*12))<<" year"<<endl;
    
    return 0;
}
