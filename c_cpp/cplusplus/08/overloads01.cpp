#include <iostream>
using namespace std;

void soma(int a, int b)
{
	cout<<"int: "<<a+b<<endl;
}

void soma(float a, float b)
{
	cout<<"float: "<<a+b<<endl;
}

int main()
{
	int a=2,b=3;
	float a_=3,b_=2;
	soma(a,b);
	soma(a_,b_);
	
	return 0;
}
