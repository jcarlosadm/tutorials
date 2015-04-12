package kiloboltgame;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import kiloboltgame.framework.Animation;

public class StartingClass extends Applet implements Runnable, KeyListener {

    private static final long serialVersionUID = 1L;
    private Robot robot;
    private Heliboy hb, hb2;
    private Image image, currentSprite, character, character2, character3,
            characterDown, characterJumped, background, heliboy, heliboy2,
            heliboy3, heliboy4, heliboy5;
    public static Image tiledirt, tileocean;
    private Animation anim, hanim;
    private URL base;
    private Graphics second;
    private static Background bg1, bg2;
    private List<Tile> tilearray = new ArrayList<>();

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
        this.character2 = this.getImage(base, "data/character2.png");
        this.character3 = this.getImage(base, "data/character3.png");
        
        this.characterDown = this.getImage(base, "data/down.png");
        this.characterJumped = this.getImage(base, "data/jumped.png");
        this.background = this.getImage(base, "data/background.png");
        
        this.heliboy = this.getImage(base, "data/heliboy.png");
        this.heliboy2 = this.getImage(base, "data/heliboy2.png");
        this.heliboy3 = this.getImage(base, "data/heliboy3.png");
        this.heliboy4 = this.getImage(base, "data/heliboy4.png");
        this.heliboy5 = this.getImage(base, "data/heliboy5.png");
        
        this.anim = new Animation();
        this.anim.addFrame(this.character, 1250);
        this.anim.addFrame(this.character2, 50);
        this.anim.addFrame(this.character3, 50);
        this.anim.addFrame(this.character2, 50);
        
        this.hanim = new Animation();
        this.hanim.addFrame(this.heliboy, 100);
        this.hanim.addFrame(this.heliboy2, 100);
        this.hanim.addFrame(this.heliboy3, 100);
        this.hanim.addFrame(this.heliboy4, 100);
        this.hanim.addFrame(this.heliboy5, 100);
        this.hanim.addFrame(this.heliboy4, 100);
        this.hanim.addFrame(this.heliboy3, 100);
        this.hanim.addFrame(this.heliboy2, 100);
        
        this.currentSprite = this.anim.getImage();
        
        tiledirt = this.getImage(base, "data/tiledirt.png");
        tileocean = this.getImage(base, "data/tileocean.png");
    }

    @Override
    public void start() {
        bg1 = new Background(0, 0);
        bg2 = new Background(2160, 0);
        
        for (int i = 0; i < 200; i++) {
            for (int j = 0; j < 12; j++) {
                if (j == 11) {
                    Tile t = new Tile(i, j, 2);
                    this.tilearray.add(t);
                }else if(j == 10){
                    Tile t = new Tile(i, j, 1);
                    this.tilearray.add(t);
                }
            }
        }
        
        this.robot = new Robot();

        this.hb = new Heliboy(340, 360);
        this.hb2 = new Heliboy(700, 360);

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
            if (this.robot.isJumped()) {
                this.currentSprite = this.characterJumped;
            } else if (this.robot.isJumped() == false
                    && this.robot.isDucked() == false) {
                this.currentSprite = this.anim.getImage();
            }

            List<?> projectiles = this.robot.getProjectiles();

            for (Iterator<?> iterator = projectiles.iterator(); iterator
                    .hasNext();) {
                Object object = (Object) iterator.next();

                Projectile p;
                if (object instanceof Projectile) {
                    p = (Projectile) object;
                    if (p.isVisible() == true) {
                        p.update();
                    } else {
                        iterator.remove();
                    }
                }

            }

            this.updateTiles();
            this.hb.update();
            this.hb2.update();
            bg1.update();
            bg2.update();
            
            animate();
            repaint();

            try {
                Thread.sleep(17);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void animate(){
        this.anim.update(10);
        this.hanim.update(50);
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

        case KeyEvent.VK_CONTROL:
            if (this.robot.isDucked() == false
                    && this.robot.isJumped() == false) {
                this.robot.shoot();
            }

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
            currentSprite = this.anim.getImage();
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
        this.paintTiles(g);

        List<?> projectiles = this.robot.getProjectiles();
        for (Object object : projectiles) {
            Projectile p;
            if (object instanceof Projectile) {
                p = (Projectile) object;
                g.setColor(Color.YELLOW);
                g.fillRect(p.getX(), p.getY(), 10, 5);
            }
        }

        g.drawImage(this.currentSprite, this.robot.getCenterX() - 61,
                this.robot.getCenterY() - 63, this);
        g.drawImage(this.hanim.getImage(), this.hb.getCenterX() - 48,
                this.hb.getCenterY() - 48, this);
        g.drawImage(this.hanim.getImage(), this.hb2.getCenterX() - 48,
                this.hb2.getCenterY() - 48, this);
    }
    
    private void updateTiles() {
        for (int i = 0; i < this.tilearray.size(); i++) {
            Tile t = (Tile) tilearray.get(i);
            t.update();
        }
    }
    
    private void paintTiles(Graphics g) {
        for (int i = 0; i < this.tilearray.size(); i++) {
            Tile t = (Tile) this.tilearray.get(i);
            g.drawImage(t.getTileImage(), t.getTileX(), t.getTileY(), this);
        }
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
