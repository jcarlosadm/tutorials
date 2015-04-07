package kiloboltgame;

public class Background {
    private int bgX, bgY, speedX;

    public Background(int x, int y) {
        this.bgX = x;
        this.bgY = y;
        this.speedX = 0;
    }

    public void update() {
        this.bgX += this.speedX;

        if (this.bgX <= -2160) {
            this.bgX += 4320;
        }
    }

    /**
     * @return the bgX
     */
    public int getBgX() {
        return this.bgX;
    }

    /**
     * @param bgX
     *            the bgX to set
     */
    public void setBgX(int bgX) {
        this.bgX = bgX;
    }

    /**
     * @return the bgY
     */
    public int getBgY() {
        return this.bgY;
    }

    /**
     * @param bgY
     *            the bgY to set
     */
    public void setBgY(int bgY) {
        this.bgY = bgY;
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

}
