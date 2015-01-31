#include <iostream>
#include "tinyXML2/tinyxml2.h"

using std::cout;
using std::endl;
using tinyxml2::XMLDocument;
using tinyxml2::XMLElement;

int main (int argc, char const* argv[])
{
    XMLDocument doc;
    
    doc.LoadFile("resource/example4.xml");
    
    XMLElement* element = doc.FirstChildElement("MyApp");
    element = element->FirstChildElement("Messages")->FirstChildElement("value");

    if(element){
        float value;
        element->QueryFloatText(&value);

        cout<< value+2 << endl;
    }else{
        cout<<"not found"<<endl;
    }
    
    return 0;
}
