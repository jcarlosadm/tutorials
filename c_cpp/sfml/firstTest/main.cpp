/**
    g++ -c main.cpp
    g++ main.o -o sfml-app -lsfml-graphics -lsfml-window -lsfml-system
    ./sfml-app
 */

#include <SFML/Graphics.hpp>

int main()
{
    // inicialização (classe RenderWindow)
    // recebe parâmetro VideoMode e título
    sf::RenderWindow window(sf::VideoMode(200, 200), "SFML works!");
    
    // classe CircleShape
    sf::CircleShape shape(100.f);
    
    // define a cor do preenchimento da forma
    shape.setFillColor(sf::Color::Green);

    // loop principal
    while (window.isOpen())
    {
    
        // cria objeto da classe Event
        sf::Event event;
        
        // enquanto houver eventos no objeto window, pega um e coloca no objeto event
        while (window.pollEvent(event))
        {
            // se o tipo de evento obtido for fechar a janela,
            // chama o método close de window
            if (event.type == sf::Event::Closed)
                window.close();
        }
        
        // limpa a janela
        window.clear();
        // desenha a forma na janela
        window.draw(shape);
        // mostra o que foi desenhado na janela
        window.display();
    }
    
    // não precisa finalizar coisa alguma!

    return 0;
}
