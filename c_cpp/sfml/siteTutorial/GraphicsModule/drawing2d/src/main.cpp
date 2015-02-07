/*
 * main.cpp
 *
 *  Created on: 06/02/2015
 *      Author: jcarlos
 */

#include <iostream>
#include <SFML/System.hpp>
#include <SFML/Window.hpp>
#include <SFML/Graphics.hpp>

int main(int argc, char **argv) {

    sf::RenderWindow window(sf::VideoMode(800, 600), "My Window");

    while(window.isOpen()){

        sf::Event event;
        while(window.pollEvent(event)){

            if(event.type == sf::Event::Closed)
                window.close();
        }

        window.clear(sf::Color::Black);

        window.display();
    }

    return 0;
}

