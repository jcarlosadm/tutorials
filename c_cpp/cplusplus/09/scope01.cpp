#include <iostream>
using namespace std;

void print(int x, int y, const char *message){
	cout<<message<<x<<" "<<y<<endl;
}

int main()
{
	int x=10;
	int y=10;
	{
		int y = 50;
		print(x, y, "in ");
	}
	print(x, y, "out ");
	
	return 0;
}
