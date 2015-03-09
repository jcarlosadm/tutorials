package br.com.remotecontrol.util;

import java.util.Stack;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Stack<Command> undoCommands;
    Stack<Command> redoCommands;
    
    public RemoteControl() {
        this.onCommands = new Command[2];
        this.offCommands = new Command[2];
        
        Command noCommand = new NoCommand();
        
        for (int i = 0; i < 2; i++) {
            this.onCommands[i] = noCommand;
            this.offCommands[i] = noCommand;
        }
        
        this.undoCommands = new Stack<Command>();
        this.redoCommands = new Stack<Command>();
    }
    
    public void setCommand(int slot, Command onCommand, Command offCommand){
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }
    
    public void onButtonWasPushed(int slot){
        this.onCommands[slot].execute();
        
        this.cleanRedoStack();
        this.undoCommands.push(this.onCommands[slot]);
    }
    
    public void offButtonWasPushed(int slot){
        this.offCommands[slot].execute();
        
        this.cleanRedoStack();
        this.undoCommands.push(this.offCommands[slot]);
    }
    
    private void cleanRedoStack(){
        if(!this.redoCommands.isEmpty()){
            this.redoCommands.removeAllElements();
        }
    }
    
    public void undoButtonWasPushed(){
        if(!this.undoCommands.isEmpty()){
            Command command = this.undoCommands.pop();
            command.undo();
            this.redoCommands.push(command);
        }
    }
    
    public void redoButtonWasPushed(){
        if(!this.redoCommands.isEmpty()){
            Command command = this.redoCommands.pop();
            command.execute();
            this.undoCommands.push(command);
        }
    }
    
    public String toString(){
        StringBuffer stringBuff = new StringBuffer();
        
        stringBuff.append("\n----- Remote Control -------\n");
        for (int i = 0; i < this.onCommands.length; i++) {
            stringBuff.append("[slot "+i+"] "+this.onCommands[i].getClass().getName()
                    +"      "+this.offCommands[i].getClass().getName()+"\n");
        }
        
        return stringBuff.toString();
    }
}
