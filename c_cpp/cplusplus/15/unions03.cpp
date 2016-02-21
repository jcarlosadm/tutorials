#include <iostream>
#include <string>
using namespace std;

struct{
	string title;
	union{
		float dolar;
		int yen;
	};
}book;

int main()
{
	book.title.assign("My book");
	book.yen = 455;
	cout<<book.title<<" : "<<book.yen<<endl;
	
	return 0;
}
