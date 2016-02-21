#include <iostream>
#include <string>
#include <sstream>
using namespace std;

int main()
{
	string my_string;
	float price;
	
	cout<<"enter price: ";
	getline(cin,my_string);
	stringstream(my_string)>>price;
	cout<<"price = "<<price<<endl;
	return 0;
}
