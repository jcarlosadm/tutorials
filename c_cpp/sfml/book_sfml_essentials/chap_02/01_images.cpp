#include <SFML/Window.hpp>
#include <SFML/Graphics.hpp>

int main()
{
    
    sf::RenderWindow window(sf::VideoMode(640, 480), "Images");

    //sf::Image image;
    //image.create(50, 50, sf::Color::Red);
    
    sf::Texture texture;
    texture.loadFromFile("Ryu.png");
    if(!texture.loadFromFile("Ryu2.png", sf::IntRect(40,0,40,70)))
        return -1;
    //texture.setRepeated(true);

    sf::RectangleShape rectangle(sf::Vector2f(texture.getSize().x, texture.getSize().y));
    //sf::RectangleShape rectangle(sf::Vector2f(texture.getSize().x * 2, texture.getSize().y * 4));
    //rectangle.setTextureRect(sf::IntRect(0,0,texture.getSize().x * 2, texture.getSize().y * 4));
    rectangle.setTexture(&texture);
    rectangle.setPosition(50, 50);

    sf::Event event;
    while(window.isOpen())
    {
        while(window.pollEvent(event)){
            if(event.type == sf::Event::Closed){
                window.close();
            }
        }

        window.clear(sf::Color::Black);

        window.draw(rectangle);

        window.display();
    }

    return 0;
}
