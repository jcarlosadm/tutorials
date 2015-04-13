package kiloboltgame;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import kiloboltgame.framework.Animation;

public class StartingClass extends Applet implements Runnable, KeyListener {

    enum GameState {
        Running, Dead
    }

    GameState state = GameState.Running;

    private static final long serialVersionUID = 1L;
    private static Robot robot;
    public static Heliboy hb, hb2;
    public static int score = 0;
    private Font font = new Font(null, Font.BOLD, 30);
    private Image image, currentSprite, character, character2, character3,
            characterDown, characterJumped, background, heliboy, heliboy2,
            heliboy3, heliboy4, heliboy5;
    public static Image tilegrassTop, tilegrassBot, tilegrassLeft,
            tilegrassRight, tiledirt;
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
        tilegrassTop = this.getImage(base, "data/tilegrasstop.png");
        tilegrassBot = this.getImage(base, "data/tilegrassbot.png");
        tilegrassLeft = this.getImage(base, "data/tilegrassleft.png");
        tilegrassRight = this.getImage(base, "data/tilegrassright.png");
    }

    @Override
    public void start() {
        bg1 = new Background(0, 0);
        bg2 = new Background(2160, 0);
        robot = new Robot();

        try {
            this.loadMap("data/map1.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        hb = new Heliboy(340, 360);
        hb2 = new Heliboy(700, 360);

        Thread thread = new Thread(this);
        thread.start();
    }

    private void loadMap(String filename) throws IOException {
        ArrayList<String> lines = new ArrayList<>();
        int width = 0;
        int height = 0;

        BufferedReader reader = new BufferedReader(new FileReader(filename));
        while (true) {
            String line = reader.readLine();
            if (line == null) {
                reader.close();
                break;
            }
            if (!line.startsWith("!")) {
                lines.add(line);
                width = Math.max(width, line.length());
            }
        }
        height = lines.size();

        for (int j = 0; j < height; j++) {
            String line = (String) lines.get(j);
            for (int i = 0; i < width; i++) {
                System.out.println(i + "is i ");

                if (i < line.length()) {
                    char ch = line.charAt(i);
                    Tile t = new Tile(i, j, Character.getNumericValue(ch));
                    this.tilearray.add(t);
                }
            }
        }

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
        if (state == GameState.Running) {
            while (true) {
                robot.update();
                if (robot.isJumped()) {
                    this.currentSprite = this.characterJumped;
                } else if (robot.isJumped() == false
                        && robot.isDucked() == false) {
                    this.currentSprite = this.anim.getImage();
                }

                List<?> projectiles = robot.getProjectiles();

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
                hb.update();
                hb2.update();
                bg1.update();
                bg2.update();

                animate();
                repaint();

                try {
                    Thread.sleep(17);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (robot.getCenterY() > 500) {
                    state = GameState.Dead;
                }
            }
        }
    }

    public void animate() {
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
            if (robot.isDucked() == false && robot.isJumped() == false) {
                robot.shoot();
                robot.setReadyToFire(false);
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

        case KeyEvent.VK_CONTROL:
            robot.setReadyToFire(true);
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
        if (state == GameState.Running) {
            g.drawImage(this.background, bg1.getBgX(), bg1.getBgY(), this);
            g.drawImage(this.background, bg2.getBgX(), bg2.getBgY(), this);
            this.paintTiles(g);

            List<?> projectiles = robot.getProjectiles();
            for (Object object : projectiles) {
                Projectile p;
                if (object instanceof Projectile) {
                    p = (Projectile) object;
                    g.setColor(Color.YELLOW);
                    g.fillRect(p.getX(), p.getY(), 10, 5);
                }
            }

            g.drawRect((int) Robot.rect.getX(), (int) Robot.rect.getY(),
                    (int) Robot.rect.getWidth(), (int) Robot.rect.getHeight());
            g.drawRect((int) Robot.rect2.getX(), (int) Robot.rect2.getY(),
                    (int) Robot.rect2.getWidth(), (int) Robot.rect2.getHeight());
            g.drawImage(this.currentSprite, robot.getCenterX() - 61,
                    robot.getCenterY() - 63, this);
            g.drawImage(this.hanim.getImage(), hb.getCenterX() - 48,
                    hb.getCenterY() - 48, this);
            g.drawImage(this.hanim.getImage(), hb2.getCenterX() - 48,
                    hb2.getCenterY() - 48, this);
            g.setFont(font);
            g.setColor(Color.WHITE);
            g.drawString(Integer.toString(score), 740, 30);
        } else if (state == GameState.Dead) {
            g.setColor(Color.BLACK);
            g.fillRect(0, 0, 800, 480);
            g.setColor(Color.WHITE);
            g.drawString("Dead", 360, 240);
        }

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

    public static Robot getRobot() {
        return robot;
    }

}
