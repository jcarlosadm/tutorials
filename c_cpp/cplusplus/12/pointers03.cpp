#include <iostream>
using namespace std;

void print(const int *array, int size)
{
	for(int i = 0 ; i < size ; i++)
	{
		cout<<array[i]<<endl;
	}
}


int main()
{
	int my_array[4]={1,2,3,4};
	print(my_array,sizeof(my_array)/sizeof(int));
	
	return 0;
}
