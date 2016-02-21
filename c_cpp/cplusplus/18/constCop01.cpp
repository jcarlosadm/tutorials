#include<iostream>
using namespace std;

class Square{
	int x;
	public:
	Square(int val){
		x = val;
	}
	void setX(int val){
		x = val;
	}
	int getX(){
		return x;
	}
};

int main()
{
	Square a(5);
	Square b = a;
	cout<<"b:"<<b.getX()<<endl;
	b.setX(10);
	cout<<"a:"<<a.getX()<<endl;
	cout<<"b:"<<b.getX()<<endl;
}
