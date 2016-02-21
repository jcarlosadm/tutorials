#include <iostream>
using namespace std;

void sum(float a,float b){
	cout<<a<<" + "<<b<<" = "<<a+b<<endl;
}

void sub(float a,float b){
	cout<<a<<" - "<<b<<" = "<<a-b<<endl;
}

void math(void(*f)(float,float),
					float a,float b)
{
	(*f)(a,b);
}

int main()
{
	math(sum,4.1,5.2);
	math(sub,4.1,5.2);
	
	return 0;
}
