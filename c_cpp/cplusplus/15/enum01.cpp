#include<iostream>
using namespace std;

enum colors{red=2,black,blue=100}my_color;

int main()
{
	colors color = black;
	cout<<color<<endl;
	my_color = blue;
	cout<<my_color<<endl;
	
	return 0;
}
