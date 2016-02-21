#include <iostream>
using namespace std;

void soma(const float &a, const float &b, float &resultado)
{
	resultado = a+b;
}

int main()
{
	float x=5,y=7,c=0;
	soma(x,y,c);
	x=10;
	cout<<c<<endl;
	return 0;
}
