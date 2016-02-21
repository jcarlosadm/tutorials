#include <iostream>
#include <string>
using namespace std;

struct{
	string title;
	union{
		float dolar;
		int yen;
	}price;
}book;

int main()
{
	book.title.assign("My book");
	book.price.dolar = 45.5;
	cout<<book.title<<" : "<<book.price.dolar<<endl;
	
	return 0;
}
