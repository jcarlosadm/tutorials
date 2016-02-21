#include <iostream>
using namespace std;

class MyClass{

	public:
	
	int x;
	
	MyClass(int val){
		x = val;
	}
	
	// sem a palavra 'const' antes das chaves, não é possível usar o método a partir de um objeto constante
	int getX() const{
		return x;
	}
	
	// aqui não dá para acessar a partir de um objeto constante, pois o objeto é somente leitura
	void setX(int val){
		x = val;
	}
	
};

int main()
{
	const MyClass foo(10);
	//foo.setX(20); // não permitido
	//foo.x = 20; // não permitido
	cout<<"foo: "<<foo.getX()<<endl;
	cout<<"foo: "<<foo.x<<endl;
	
	MyClass foo2(20);
	cout<<"foo2: "<<foo2.x<<endl;
	foo2.setX(30);
	cout<<"foo2: "<<foo2.getX()<<endl;
	
	return 0;
}
