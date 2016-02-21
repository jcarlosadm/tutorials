// compile with -lsfml-graphics -lsfml-window -lsfml-system
#include <SFML/Window.hpp>
#include <SFML/Graphics.hpp>

int main()
{
    sf::RenderWindow window(sf::VideoMode(640, 480), "The title");
    //sf::sleep(sf::seconds(3));
    
    sf::CircleShape circle(50);
    circle.setFillColor(sf::Color::Red);
    circle.setOutlineColor(sf::Color::White);
    circle.setOutlineThickness(3);

    sf::RectangleShape rectangle(sf::Vector2f(50, 50));
    rectangle.setFillColor(sf::Color::Green);
    rectangle.setPosition(150, 150);

    sf::Event event;
    sf::String buffer;
    while(window.isOpen())
    {
        while(window.pollEvent(event)){
            if(event.type == sf::Event::Closed){
                window.close();
            }
            switch(event.type){
            
            case sf::Event::Closed:
                window.close();
                break;
            case sf::Event::KeyReleased:
                if(event.key.code == sf::Keyboard::Escape){
                    window.close();
                } else if(event.key.code == sf::Keyboard::Return){
                    window.setTitle(buffer);
                    buffer.clear();
                }
                break;
            case sf::Event::TextEntered:
                buffer += event.text.unicode;
                break;
            
            }
        }

        window.clear(sf::Color::Black);

        window.draw(circle);
        window.draw(rectangle);

        window.display();
    }

    return 0;
}
