package br.com.remotecontrol.util;

public class NoCommand implements Command{

    public NoCommand() {}
    
    @Override
    public void execute() {}

    @Override
    public void undo() {}

}
