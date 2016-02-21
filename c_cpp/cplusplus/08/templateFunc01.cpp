#include <iostream>
using namespace std;

template<class T>
void  soma(T a,T b) // se retornasse algo, ao invés de void poderia ter T
{
	cout<<a+b<<endl;
}

int main()
{
	soma<int>(1,3);
	soma<float>(2.4,5);
	return 0;
}
