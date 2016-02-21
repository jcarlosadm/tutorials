#include <iostream>
#include <string>
using namespace std;

class Person {
	string name;
	int age;
	
	public:
	void defineName(const char *c);
	void defineAge(int);
	void print(){
		cout<<name<<" : "<<age<<endl;
	}
};

void Person::defineName(const char *c){
	name.assign(c);
}

void Person::defineAge(int n){
	age = n;
}

int main()
{
	Person carlos;
	carlos.defineName("Carlos");
	carlos.defineAge(29);
	carlos.print();
	
	return 0;
}
