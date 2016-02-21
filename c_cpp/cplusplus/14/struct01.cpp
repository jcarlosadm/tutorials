#include <iostream>
#include <string>
using namespace std;

struct movie{
	string name;
	int rating;
};

int main()
{
	movie jango;
	jango.name.assign("Jango");
	jango.rating = 5;
	cout<<jango.name<<" rating: "<<jango.rating<<endl;
	
	return 0;
}
