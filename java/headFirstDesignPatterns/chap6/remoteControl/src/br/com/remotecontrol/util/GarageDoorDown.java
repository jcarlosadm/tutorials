package br.com.remotecontrol.util;

import br.com.remotecontrol.out.GarageDoor;

public class GarageDoorDown implements Command{

    private GarageDoor garageDoor;
    
    public GarageDoorDown(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    
    @Override
    public void execute() {
        this.garageDoor.down();
    }

    @Override
    public void undo() {
        this.garageDoor.up();
    }

}
