package test.tilemap;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class Renderer extends Applet implements Runnable, KeyListener {

    private static final long serialVersionUID = 1L;

    static int[][] tilemap;
    static int rows, columns;
    Image image1;
    Graphics second;
    Image image2;
    Graphics graphics;
    int x =0 , y =0;
    
    ControlClass controlClass = new ControlClass();

    @Override
    public void init() {
        this.setFocusable(true);
        this.addKeyListener(this);
        this.setSize(800, 480);
        this.setBackground(Color.BLACK);
        this.createTilemap();
    }

    private void createTilemap() {
        tilemap = new int[50][30];
        rows = tilemap.length;
        columns = tilemap[1].length;
        
        Random r = new Random();
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                tilemap[i][j] = r.nextInt(5);
            }
            
        }
    }
    
    @Override
    public void start() {
        Thread t = new Thread(this);
        t.start();
    }
    
    @Override
    public void update(Graphics g) {
        if(this.image1 == null){
            this.image1 = createImage(this.getWidth(), this.getHeight());
            this.second = this.image1.getGraphics();
            
            this.image2 = createImage(this.getWidth(), this.getHeight());
            this.graphics = this.image2.getGraphics();
            
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    int mod_i = 16*i;
                    int mod_j = 16*j;
                    
                    switch (tilemap[i][j]) {
                    case 0:
                        graphics.setColor(Color.RED);
                        graphics.fillRect(mod_i, mod_j, 16, 16);
                        break;
                    case 1:
                        graphics.setColor(Color.BLUE);
                        graphics.fillRect(mod_i, mod_j, 16, 16);
                        break;
                    case 2:
                        graphics.setColor(Color.YELLOW);
                        graphics.fillRect(mod_i, mod_j, 16, 16);
                        break;
                    case 3:
                        graphics.setColor(Color.WHITE);
                        graphics.fillRect(mod_i, mod_j, 16, 16);
                        break;
                    case 4:
                        graphics.setColor(Color.GREEN);
                        graphics.fillRect(mod_i, mod_j, 16, 16);
                        break;
                    }
                    
                }
            }
            
        }
        
        this.second.setColor(this.getBackground());
        this.second.fillRect(0, 0, this.getWidth(), this.getHeight());
        this.second.setColor(this.getForeground());
        this.paint(this.second);

        g.drawImage(this.image1, 0, 0, this);
    }

    @Override
    public void paint(Graphics g) {
        
        //x++;
        y++;
        g.drawImage(this.image2, this.controlClass.getX(), this.y, this);
        
    }

    @Override
    public void run() {
        while (true) {
            this.repaint();
            
            try {
                Thread.sleep(17);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        this.controlClass.keyPressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

}
