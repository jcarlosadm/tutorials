#include <iostream>
#include <new>
using namespace std;

class Person{
	
	private:
	static int count;
	public:
	Person(){
		count+=1;
	}
	~Person(){
		count-=1;
	}
	static int getCount(){
		return count;
	}
};
int Person::count=0;

int main()
{
	cout<<Person::getCount()<<endl;
	Person *a = new Person;
	cout<<Person::getCount()<<endl;
	Person *b = new Person;
	cout<<Person::getCount()<<endl;
	delete a;
	cout<<Person::getCount()<<endl;
	delete b;
	cout<<Person::getCount()<<endl;
	return 0;
}
