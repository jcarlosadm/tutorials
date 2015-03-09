package br.com.remotecontrol.util;

import br.com.remotecontrol.out.GarageDoor;

public class GarageDoorUp implements Command{

    private GarageDoor garageDoor;
    
    public GarageDoorUp(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    
    @Override
    public void execute() {
        this.garageDoor.up();
    }

    @Override
    public void undo() {
        this.garageDoor.down();
    }

}
