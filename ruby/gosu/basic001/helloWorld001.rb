require 'gosu'

class GameWindow < Gosu::Window
    attr_reader :x, :y
    def initialize
        super 640, 480, false
        self.caption = "Gosu Tutorial Game"
        
        @image = Gosu::Image.new(self, "image.jpg",true)
        
        @x = 0
        @y = 0
    end
    
    def update
        if button_down? Gosu::KbDown then
            @y = @y + 1
        end
        if button_down? Gosu::KbUp then
            @y = @y - 1
        end
        if button_down? Gosu::KbLeft then
            @x = @x - 1
        end
        if button_down? Gosu::KbRight then
            @x = @x + 1
        end
    end
    
    def draw
        @image.draw(@x,@y,0)
    end
end

window = GameWindow.new
window.show
