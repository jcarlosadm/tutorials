/*
 * main.cpp
 *
 *  Created on: 07/02/2015
 *      Author: jcarlos
 */

#include <iostream>
#include <SFML/System.hpp>
#include <SFML/Window.hpp>
#include <SFML/Graphics.hpp>

int main(int argc, char **argv) {

    sf::RenderWindow window(sf::VideoMode(800, 600), "MyWindow");

    sf::Texture texture;
    if(!texture.loadFromFile("resources/image.png", sf::IntRect(10, 10, 650, 180))){
        return 1;
    }
    sf::Sprite sprite;
    sprite.setTexture(texture);
    sprite.setPosition(10, 10);
    sprite.setColor(sf::Color(0,255,0, 128));
    sprite.rotate(15);

    while(window.isOpen()){
        sf::Event event;
        while(window.pollEvent(event)){
            if(event.type == sf::Event::Closed){
                window.close();
            }
        }

        window.clear(sf::Color::White);

        window.draw(sprite);

        window.display();
    }

    return 0;
}

