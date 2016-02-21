#include <iostream>
#include <cstring>
using namespace std;

/*
Veja que se usa a memória alocada de carlos para name primeiro, mostrando o valor no cout, mas depois que definimos age, name perde o valor e age é alocado.
*/

union person{
	char name[20];
	int age;
};

int main(){
	person carlos;
	strcpy(carlos.name,"Carlos");
	cout<<carlos.name<<endl;
	carlos.age = 29;
	
	cout<<carlos.name<<" age: "<<carlos.age<<endl;
    
    strcpy(carlos.name, "Carlos");

    cout<<carlos.name<<" age: "<<carlos.age<<endl;

	return 0;
}
