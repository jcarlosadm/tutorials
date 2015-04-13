package kiloboltgame;

import java.awt.Rectangle;

public class Projectile {

    private int x, y, speedX;
    private boolean visible;
    private Rectangle r;

    public Projectile(int startX, int startY) {
        this.x = startX;
        this.y = startY;
        this.speedX = 7;
        this.visible = true;
        this.r = new Rectangle(0, 0, 0, 0);
    }

    public void update() {
        this.x += this.speedX;
        r.setBounds(this.x, this.y, 10, 5);

        if (this.x >= 800) {
            this.visible = false;
        }

        if (x < 800) {
            this.checkCollision();
        }
    }

    private void checkCollision() {
        if (r.intersects(StartingClass.hb.r)) {
            visible = false;
            if (StartingClass.hb.health > 0) {
                StartingClass.hb.health -= 1;
            }
            if (StartingClass.hb.health == 0) {
                StartingClass.hb.setCenterX(-100);
                StartingClass.score += 5;

            }
        }

        if (r.intersects(StartingClass.hb2.r)) {
            visible = false;
            if (StartingClass.hb2.health > 0) {
                StartingClass.hb2.health -= 1;
            }
            if (StartingClass.hb2.health == 0) {
                StartingClass.hb2.setCenterX(-100);
                StartingClass.score += 5;

            }
        }

    }

    /**
     * @return the x
     */
    public int getX() {
        return this.x;
    }

    /**
     * @param x
     *            the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return this.y;
    }

    /**
     * @param y
     *            the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the speedX
     */
    public int getSpeedX() {
        return this.speedX;
    }

    /**
     * @param speedX
     *            the speedX to set
     */
    public void setSpeedX(int speedX) {
        this.speedX = speedX;
    }

    /**
     * @return the visible
     */
    public boolean isVisible() {
        return this.visible;
    }

    /**
     * @param visible
     *            the visible to set
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

}
