#include <iostream>
#include <new>
using namespace std;

int main()
{
	int *p = NULL;
	p = new (nothrow) int[5];
	if(p==NULL)
		cout<<"memoria nao alocada"<<endl;
	else{
	
		for(int i = 0; i < 5 ; i++)
		{
			p[i]=i+1;
		}
		for(int i=0; i<5; i++)
		{
			cout<<*(p+i)<<endl;
		}
		delete[] p;
		
	}
	
	return 0;
}
