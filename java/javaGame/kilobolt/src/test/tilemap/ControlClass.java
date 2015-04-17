package test.tilemap;

import java.awt.event.KeyEvent;

public class ControlClass {

    int x = 0;
    
    public ControlClass() {
        // TODO Auto-generated constructor stub
    }

    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()){
        case KeyEvent.VK_DOWN:
            this.x++;
            break;
        }

    }
    
    public int getX(){
        return this.x;
    }

    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

}
