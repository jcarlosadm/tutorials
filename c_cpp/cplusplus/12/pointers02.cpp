#include <iostream>
using namespace std;

int main()
{
	int my_array[5];
	int *p = my_array;
	
	for(int i = 0;i<sizeof(my_array)/sizeof(int);i++)
	{
		*(p+i) = i+1;
	}
	
	for(int i =0 ; i<sizeof(my_array)/sizeof(int);i++)
	{
		cout<<my_array[i]<<endl;
	}
	
	return 0;
}
