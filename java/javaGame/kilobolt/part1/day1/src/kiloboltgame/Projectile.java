package kiloboltgame;

public class Projectile {

    private int x, y, speedX;
    private boolean visible;

    public Projectile(int startX, int startY) {
        this.x = startX;
        this.y = startY;
        this.speedX = 7;
        this.visible = true;
    }

    public void update() {
        this.x += this.speedX;
        if (this.x >= 800) {
            this.visible = false;
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
