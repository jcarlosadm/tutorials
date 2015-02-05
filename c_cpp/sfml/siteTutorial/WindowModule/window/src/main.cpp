/*
 * main.cpp
 *
 *  Created on: 05/02/2015
 *      Author: jcarlos
 */

#include <iostream>
#include <SFML/Window.hpp>

using namespace std;

int main(int argc, char **argv) {

    // instancializa o vídeo
    sf::Window window(sf::VideoMode(800, 600), "My window");

    // recria o mesmo vídeo
    window.create(sf::VideoMode(800, 600), "My new window", sf::Style::Close);

    window.setPosition(sf::Vector2i(10, 50));
    window.setSize(sf::Vector2u(640, 480));
    window.setTitle("My window");
    window.setFramerateLimit(60);

    // enquanto a janela estiver aberta...
    while(window.isOpen()){

        // variável que guardará um evento
        sf::Event event;

        // enquanto houver eventos na janela, pega um e põe em event...
        while(window.pollEvent(event)){

            // se o tipo de evento for fechar, fecha a janela
            if(event.type == sf::Event::Closed){
                window.close();
            }
        }
    }

    return 0;
}
