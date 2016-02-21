#include<iostream>
#include<ctime>

using namespace std;

int main(){
    
    time_t base = time(0);
    
    cout<<ctime(&base)<<endl;
    
    struct tm* tm = localtime(&base);
    
    tm->tm_mday += 7*2; // +2 semanas
    tm->tm_mon += 1;
    tm->tm_mday += 1;
    //tm->tm_mon += 1;
    
    cout<< tm->tm_wday <<endl;
    
    base = mktime(tm);
    
    cout<<ctime(&base)<<endl;
    
    return 0;
}
