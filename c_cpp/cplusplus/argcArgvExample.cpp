/* Exemplo de uso dos comandos argc e argv */
/* use a opção -std=c++0x na compilação para usar atoi */

#include <iostream>
using namespace std;

int main(int argc, char *argv[])
{
    if(argc==2)
    {
        int value = atoi(argv[1]);
        cout<<value<<endl;
    }else{
        cout<<"passe um numero!\n";
    }
    
    return 0;
}
