#include <iostream>
using namespace std;

template <class T,int N>
void somatorio(T a,T b)
{
	cout<<(a+b)*N<<endl;
}

int main()
{
	somatorio<int,5>(4,3);
	return 0;
}
