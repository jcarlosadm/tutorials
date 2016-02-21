#include<iostream>
using namespace std;

/* exemplo de passagem por referência */

void soma(float a,float b,float &resultado)
{
	resultado = a+b;
}

int main()
{
	float c;
	soma(11,4,c);
	cout<<c<<endl;
	
	return 0;
}
