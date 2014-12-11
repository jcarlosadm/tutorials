Biblioteca na pasta do projeto

requisitos:
1. Tenha todos os header files da biblioteca na pasta do projeto
2. Tenha o arquivo lib da biblioteca (ou seu link simbólico) na pasta do projeto
3. Cada arquivo que fizer uso da biblioteca precisa dar include nos header files corretos. Por exemplo '#include "mylib/shock.hpp"'

compile:
g++ -c main.cpp -o main.o
g++ main.o -L. -lflowAsteroids -o main
ou
g++ -o main main.cpp -L. -lflowAsteroids

use
    export LD_LIBRARY_PATH=$LD_LIBRARY_PATH:/./
    
antes de executar o binário

Se a biblioteca for alterada, não é necessário recompilar o programa

-------------------------------------------------------------------------------------

Biblioteca na pasta padrão do sistema

requisitos:
1. Os header files precisam estar na pasta padrão para includes do sistema. No linux, essa pasta é "/usr/local/include/". Procure nomear adequadamente possíveis subpastas para não confundir com outros arquivos.
2. O arquivo da biblioteca (terminado em .so para linux ou .dll ou .dll.a para windows) precisa estar na pasta padrão do sistema para bibliotecas. No linux, essa pasta é "/usr/local/lib/".
3. Cada arquivo que fizer uso da bilioteca precisa dar include no header file correto. Por exemplo, "#include <mylib/shock.hpp>". O sistema irá procurar esses header files na pasta padrão.

compile:
g++ -c main.cpp -o main.o
g++ main.o -lflowAsteroids -o main
ou:
g++ -o main main.cpp -lflowAsteroids

Basta executar o binário (o sistema se encarregará de encontrar a biblioteca na pasta padrão para arquivos de biblioteca do sistema)

Se a biblioteca for alterada, não é necessário recompilar o programa. É bastante útil ter um script que atualize os header files e arquivos de biblioteca automaticamente quando necessário.
