#include <iostream>
#include <string>
using namespace std;

struct serie{
	string name;
	int rating;
}dexter,sherlock;

int main()
{
	dexter.name.assign("Dexter");
	dexter.rating = 4;
	sherlock.name.assign("Sherlock");
	sherlock.rating = 5;
	serie friends;
	friends.name.assign("Friends");
	friends.rating = 5;
	cout<<dexter.name<<" : "<<dexter.rating<<endl;
	cout<<sherlock.name<<" : "<<sherlock.rating<<endl;
	cout<<friends.name<<" : "<<friends.rating<<endl;
	
	return 0;
}
