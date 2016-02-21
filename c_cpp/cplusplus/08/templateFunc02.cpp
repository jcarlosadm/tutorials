#include <iostream>
using namespace std;

template <class T,class U>
T soma(U a, U b)
{
	T result = a+b;
	return result;
}

int main()
{
	cout<<soma<int,float>(2.3,2.9)<<endl;
	
	return 0;
}
