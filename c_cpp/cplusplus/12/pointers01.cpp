#include <iostream>
using namespace std;

// operador de referência

int main()
{
	int a;
	int *p = &a;
	
	*p = 5;
	cout << a << endl;
	
	return 0;
}
