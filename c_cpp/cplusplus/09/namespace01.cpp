#include <iostream>
using namespace std;

namespace trigonometria
{
	float  pi = 3.14;
	float dobro_pi()
	{
		cout<<pi*2<<endl;
	}
}

int main()
{
	cout<< trigonometria::pi <<endl;
	trigonometria::dobro_pi();
	
	return 0;
}
