#include <iostream>
#include <string>
#include <new>
using namespace std;

struct movie{
	string name;
	int rating;
};

void defineMovie(movie *m,const char *name,const int rating){
	m->name.assign(name);
	m->rating = rating;
}

int main()
{
	movie *dexter,*got;
	dexter = new movie;
	got = new movie;
	defineMovie(dexter,"Dexter",5);
	defineMovie(got,"Game of Thrones",6);
	cout<<dexter->name<<" : "<<dexter->rating<<endl;
	cout<<got->name<<" : "<<got->rating<<endl;
	
	delete dexter;
	delete got;
	
	return 0;
}
