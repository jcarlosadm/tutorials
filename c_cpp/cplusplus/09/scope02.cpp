#include <iostream>
using namespace std;

int y = 10;

int main()
{
	int x=10;
	int y = 50;
	cout<<"in "<<x<<" "<<y<<endl;
	cout<<"out "<<x<<" "<<::y<<endl;
	
	return 0;
}
