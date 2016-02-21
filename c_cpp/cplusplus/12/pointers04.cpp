#include <iostream>
using namespace std;

// using string literals

void print(const char *name)
{
	int i = 0;
	while(name[i] != '\0')
	{
		cout<<name[i];
		i++;
	}
	cout<<endl;
}

int main()
{
	print("carlos");
	
	return 0;
}
