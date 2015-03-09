package br.com.remotecontrol.util;

public interface Command {
	public void execute();
	public void undo();
}
