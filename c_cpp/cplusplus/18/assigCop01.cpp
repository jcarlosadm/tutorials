// copy constructor: deep copy
#include <iostream>
#include <string>
using namespace std;

class Example5 {
    string* ptr;
  public:
    Example5 (const string& str){
    	ptr = new string;
    	(*ptr).assign(str);
    }
    ~Example5 () {delete ptr;}
    // copy constructor:
    Example5(const Example5 &x){
		ptr = new string;
		(*ptr).assign(x.content());
	}
	Example5& operator=(const Example5& x){
		*ptr = x.content();
		return *this;
	}
    // access content:
    const string& content() const {return *ptr;}
};

int main () {
  Example5 foo ("Exampleahshahsahsa");
  Example5 bar = foo;
  foo = bar;

  cout << "bar's content: " << foo.content() << '\n';
  return 0;
}
