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

    private static final long serialVersionUID = 1L;
    private Robot robot;
    private Image image, currentSprite, character, characterDown,
            characterJumped, background;
    private URL base;
    private Graphics second;
    private static Background bg1, bg2;

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
        this.characterDown = this.getImage(base, "data/down.png");
        this.characterJumped = this.getImage(base, "data/jumped.png");
        this.currentSprite = this.character;
        this.background = this.getImage(base, "data/background.png");
    }

    @Override
    public void start() {
        bg1 = new Background(0, 0);
        bg2 = new Background(2160, 0);
        this.robot = new Robot();

        Thread thread = new Thread(this);
        thread.start();
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
            if(this.robot.isJumped()){
                this.currentSprite = this.characterJumped;
            }else if(this.robot.isJumped() == false && this.robot.isDucked() == false){
                this.currentSprite = this.character;
            }
            
            bg1.update();
            bg2.update();
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
            System.out.println("Move up");
            break;

        case KeyEvent.VK_DOWN:
            currentSprite = characterDown;
            if (robot.isJumped() == false) {
                robot.setDucked(true);
                robot.setSpeedX(0);
            }
            break;

        case KeyEvent.VK_LEFT:
            robot.moveLeft();
            robot.setMovingLeft(true);
            break;

        case KeyEvent.VK_RIGHT:
            robot.moveRight();
            robot.setMovingRight(true);
            break;

        case KeyEvent.VK_SPACE:
            robot.jump();
            break;

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
        case KeyEvent.VK_UP:
            System.out.println("Stop moving up");
            break;

        case KeyEvent.VK_DOWN:
            currentSprite = character;
            robot.setDucked(false);
            break;

        case KeyEvent.VK_LEFT:
            robot.stopLeft();
            break;

        case KeyEvent.VK_RIGHT:
            robot.stopRight();
            break;

        case KeyEvent.VK_SPACE:
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
        g.drawImage(this.background, bg1.getBgX(), bg1.getBgY(), this);
        g.drawImage(this.background, bg2.getBgX(), bg2.getBgY(), this);
        g.drawImage(this.currentSprite, this.robot.getCenterX() - 61,
                this.robot.getCenterY() - 63, this);
    }

    /**
     * @return the bg1
     */
    public static Background getBg1() {
        return bg1;
    }

    /**
     * @return the bg2
     */
    public static Background getBg2() {
        return bg2;
    }

}
