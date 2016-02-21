// derived classes
#include <iostream>
using namespace std;

class Polygon {
  protected:
    int width, height;
  public:
    void set_values (int a, int b)
      { width=a; height=b;}
 };

class Rectangle: private Polygon {
  public:
  Rectangle(int w,int h){
  	set_values(w,h);
  };
  int area ()
      { return width * height; }
 };

class Triangle: private Polygon {
  public:
  Triangle(int w,int h){
  	set_values(w,h);
  };
  int area ()
      { return width * height / 2; }
  };
  
int main () {
  Rectangle rect(4,5);
  Triangle trgl(4,5);
  //rect.set_values (4,5);
  //trgl.set_values (4,5);
  cout << rect.area() << '\n';
  cout << trgl.area() << '\n';
  return 0;
}
