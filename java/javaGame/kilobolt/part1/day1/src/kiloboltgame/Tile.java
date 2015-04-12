package kiloboltgame;

import java.awt.Image;
import java.awt.Rectangle;

public class Tile {

    private int tileX, tileY, speedX, type;
    private Image tileImage;
    private Background bg = StartingClass.getBg1();
    private Robot robot = StartingClass.getRobot();
    private Rectangle r;

    public Tile(int x, int y, int typeInt) {
        this.tileX = x * 40;
        this.tileY = y * 40;

        this.type = typeInt;

        this.r = new Rectangle();

        if (this.type == 5) {
            this.tileImage = StartingClass.tiledirt;
        } else if (this.type == 8) {
            this.tileImage = StartingClass.tilegrassTop;
        } else if (this.type == 4) {
            this.tileImage = StartingClass.tilegrassLeft;
        } else if (this.type == 6) {
            this.tileImage = StartingClass.tilegrassRight;
        } else if (this.type == 2) {
            this.tileImage = StartingClass.tilegrassBot;
        } else {
            this.type = 0;
        }
    }

    public void update() {
        this.speedX = bg.getSpeedX() * 5;
        this.tileX += this.speedX;
        r.setBounds(this.tileX, this.tileY, 40, 40);
        
        if(this.type != 0){
            this.checkVerticalCollision(Robot.rect, Robot.rect2);
        }
    }

    public void checkVerticalCollision(Rectangle rtop, Rectangle rbot) {
        if (rtop.intersects(this.r)) {
            System.out.println("upper collision");
        }

        if (rbot.intersects(this.r)) {
            System.out.println("lower collision");
        }
    }

    /**
     * @return the tileX
     */
    public int getTileX() {
        return this.tileX;
    }

    /**
     * @param tileX
     *            the tileX to set
     */
    public void setTileX(int tileX) {
        this.tileX = tileX;
    }

    /**
     * @return the tileY
     */
    public int getTileY() {
        return this.tileY;
    }

    /**
     * @param tileY
     *            the tileY to set
     */
    public void setTileY(int tileY) {
        this.tileY = tileY;
    }

    /**
     * @return the tileImage
     */
    public Image getTileImage() {
        return this.tileImage;
    }

    /**
     * @param tileImage
     *            the tileImage to set
     */
    public void setTileImage(Image tileImage) {
        this.tileImage = tileImage;
    }

    /**
     * @return the speedX
     */
    public int getSpeedX() {
        return this.speedX;
    }

    /**
     * @return the type
     */
    public int getType() {
        return this.type;
    }

}
