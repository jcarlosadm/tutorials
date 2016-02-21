#include <iostream>
#include <string>
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
	movie dexter;
	defineMovie(&dexter,"Dexter",5);
	cout<<dexter.name<<" : "<<dexter.rating<<endl;
	
	return 0;
}
