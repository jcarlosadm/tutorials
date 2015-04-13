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

        if (r.intersects(Robot.yellowRed) && type != 0) {
            this.checkVerticalCollision(Robot.rect, Robot.rect2);
            this.checkSideCollision(Robot.rect3, Robot.rect4, Robot.footleft,
                    Robot.footright);
        }
    }

    public void checkVerticalCollision(Rectangle rtop, Rectangle rbot) {
        if (rtop.intersects(r)) {

        }

        if (rbot.intersects(r) && type == 8) {
            robot.setJumped(false);
            robot.setSpeedY(0);
            robot.setCenterY(tileY - 63);
        }
    }

    public void checkSideCollision(Rectangle rleft, Rectangle rright,
            Rectangle leftfoot, Rectangle rightfoot) {
        if (type != 5 && type != 2 && type != 0) {
            if (rleft.intersects(r)) {
                robot.setCenterX(tileX + 102);

                robot.setSpeedX(0);

            } else if (leftfoot.intersects(r)) {
                robot.setCenterX(tileX + 85);
                robot.setSpeedX(0);
            }

            if (rright.intersects(r)) {
                robot.setCenterX(tileX - 62);

                robot.setSpeedX(0);
            }

            else if (rightfoot.intersects(r)) {
                robot.setCenterX(tileX - 45);
                robot.setSpeedX(0);
            }
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
