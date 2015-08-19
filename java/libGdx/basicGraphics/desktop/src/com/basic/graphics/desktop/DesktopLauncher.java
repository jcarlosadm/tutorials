package com.basic.graphics.desktop;

import java.awt.Dimension;
import java.awt.Toolkit;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.basic.graphics.BasicGraphics;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		config.height = (int) screenSize.getHeight() - 60;
		config.width = (int) screenSize.getWidth() - 20;
		new LwjglApplication(new BasicGraphics(), config);
	}
}
