#include <iostream>
#include <string>
using namespace std;

class Person {
	string name;
	int age;
	
	public:
	Person(string arg_name,int arg_age)
	{
		name.assign(arg_name);
		age = arg_age;
	}
	void print(){
		cout<<name<<" : "<<age<<endl;
	}
};

int main()
{
	Person carlos("Carlos",29);
	carlos.print();
	
	return 0;
}
