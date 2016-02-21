#include <iostream>
#include <array>
using namespace std;


// use a opção -std=c++0x para compilar
int main()
{
	array<int,4> my_array;
	// size retorna a quantidade de elementos do array
	cout<<my_array.size()<<endl;
	// sizeof retorna a quantidade de bytes alocados
	cout<<sizeof(my_array)<<endl;
	return 0;
}
