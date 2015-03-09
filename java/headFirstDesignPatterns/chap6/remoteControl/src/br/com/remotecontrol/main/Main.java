package br.com.remotecontrol.main;

import br.com.remotecontrol.out.GarageDoor;
import br.com.remotecontrol.out.Light;
import br.com.remotecontrol.util.GarageDoorDown;
import br.com.remotecontrol.util.GarageDoorUp;
import br.com.remotecontrol.util.LightOffCommand;
import br.com.remotecontrol.util.LightOnCommand;
import br.com.remotecontrol.util.RemoteControl;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        GarageDoorUp garageDoorUp = new GarageDoorUp(garageDoor);
        GarageDoorDown garageDoorDown = new GarageDoorDown(garageDoor);
        
        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, garageDoorUp, garageDoorDown);
        
        remoteControl.onButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(0);
        System.out.println("\nundo");
        remoteControl.undoButtonWasPushed();
        System.out.println("\nredo");
        remoteControl.redoButtonWasPushed();
        System.out.println("\nundo");
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        System.out.println("\nredo");
        remoteControl.redoButtonWasPushed();
    }
}
