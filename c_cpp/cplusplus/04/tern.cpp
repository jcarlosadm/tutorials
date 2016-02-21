#include <iostream>
using namespace std;

/* exemplo usando operador ternário */
int main()
{
	int n;

	cout<<"digite um numero inteiro: ";
	cin>>n;
	n<0 ? cout<<"numero negativo"<<endl : cout<<"numero 0 ou positivo"<<endl;
	return 0;
}
