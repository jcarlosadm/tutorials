package kiloboltgame;

import java.awt.Image;

public class Tile {

    private int tileX, tileY, speedX, type;
    private Image tileImage;
    private Background bg = StartingClass.getBg1();

    public Tile(int x, int y, int typeInt) {
        this.tileX = x * 40;
        this.tileY = y * 40;

        this.type = typeInt;

        if (this.type == 1) {
            this.tileImage = StartingClass.tileocean;
        } else if (this.type == 2) {
            this.tileImage = StartingClass.tiledirt;
        }
    }

    public void update() {
        if (this.type == 1) {
            if (this.bg.getSpeedX() == 0) {
                this.speedX = -1;
            } else {
                this.speedX = -2;
            }
        } else {
            this.speedX = this.bg.getSpeedX() * 5;
        }

        this.tileX += this.speedX;
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
