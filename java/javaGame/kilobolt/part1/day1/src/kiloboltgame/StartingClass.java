package kiloboltgame;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;

public class StartingClass extends Applet implements Runnable, KeyListener {

    private Robot robot;
    private Image image, character;
    private URL base;
    private Graphics second;

    @Override
    public void init() {
        setSize(800, 480);
        setBackground(Color.black);
        setFocusable(true);
        addKeyListener(this);
        Frame frame = (Frame) this.getParent().getParent();
        frame.setTitle("Q-Bolt Alpha");

        try {
            this.base = this.getDocumentBase();
        } catch (Exception e) {
            e.printStackTrace();
        }

        this.character = this.getImage(base, "data/character.png");
    }

    @Override
    public void start() {
        this.robot = new Robot();

        Thread thread = new Thread(this);
        thread.run();
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        super.stop();
    }

    @Override
    public void destroy() {
        // TODO Auto-generated method stub
        super.destroy();
    }

    @Override
    public void run() {
        while (true) {
            this.robot.update();
            repaint();

            try {
                Thread.sleep(17);
            } catch (InterruptedException e) {
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
        switch (e.getKeyCode()) {
        case KeyEvent.VK_UP:
            System.out.println("move up");
            break;

        case KeyEvent.VK_DOWN:
            System.out.println("move down");
            break;

        case KeyEvent.VK_LEFT:
            this.robot.moveLeft();
            break;

        case KeyEvent.VK_RIGHT:
            this.robot.moveRight();
            break;

        case KeyEvent.VK_SPACE:
            this.robot.jump();
            break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
        case KeyEvent.VK_UP:
            System.out.println("move up");
            break;

        case KeyEvent.VK_DOWN:
            System.out.println("move down");
            break;

        case KeyEvent.VK_LEFT:
            this.robot.stop();
            break;

        case KeyEvent.VK_RIGHT:
            this.robot.stop();
            break;

        case KeyEvent.VK_SPACE:
            System.out.println("jump");
            break;
        }
    }

    @Override
    public void update(Graphics g) {
        if (this.image == null) {
            this.image = createImage(this.getWidth(), this.getHeight());
            this.second = this.image.getGraphics();
        }

        this.second.setColor(this.getBackground());
        this.second.fillRect(0, 0, this.getWidth(), this.getHeight());
        this.second.setColor(this.getForeground());
        this.paint(this.second);

        g.drawImage(this.image, 0, 0, this);
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(this.character, this.robot.getCenterX() - 61,
                this.robot.getCenterY() - 63, this);
    }

}
