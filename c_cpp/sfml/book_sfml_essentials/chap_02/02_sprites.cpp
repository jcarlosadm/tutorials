#include <SFML/Window.hpp>
#include <SFML/Graphics.hpp>

int main()
{
    
    sf::RenderWindow window(sf::VideoMode(640, 480), "Images");

    sf::Texture texture;
    texture.loadFromFile("Ryu.png");
    if(!texture.loadFromFile("Ryu.png", sf::IntRect(40,0,40,70)))
        return -1;

    sf::Sprite sp(texture);
    sp.move(50, 50);

    sf::Event event;
    while(window.isOpen())
    {
        while(window.pollEvent(event)){
            if(event.type == sf::Event::Closed){
                window.close();
            }
        }

        window.clear(sf::Color::Black);

        window.draw(sp);

        window.display();
    }

    return 0;
}
