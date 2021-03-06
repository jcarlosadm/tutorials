package kiloboltgame;

import java.awt.Rectangle;

public class Enemy {

    private int power, speedX, centerX, centerY;
    private Background bg = StartingClass.getBg1();
    public Rectangle r = new Rectangle(0, 0, 0, 0);

    public int health = 5;

    private int movementSpeed;

    public void update() {
        this.follow();
        this.centerX += this.speedX;
        this.speedX = this.bg.getSpeedX() * 5 + this.movementSpeed;

        r.setBounds(centerX - 25, centerY - 25, 50, 60);

        if (r.intersects(Robot.yellowRed)) {
            this.checkCollision();
        }
    }

    public void follow() {

        if (centerX < -95 || centerX > 810) {
            movementSpeed = 0;
        }

        else if (Math.abs(StartingClass.getRobot().getCenterX() - centerX) < 5) {
            movementSpeed = 0;
        }

        else {

            if (StartingClass.getRobot().getCenterX() >= centerX) {
                movementSpeed = 1;
            } else {
                movementSpeed = -1;
            }
        }

    }

    private void checkCollision() {
        if (r.intersects(Robot.rect) || r.intersects(Robot.rect2)
                || r.intersects(Robot.rect3) || r.intersects(Robot.rect4)) {
            System.out.println("collision");

        }

    }

    public void die() {
        // TODO Auto-generated method stub

    }

    public void attack() {
        // TODO Auto-generated method stub

    }

    /**
     * @return the power
     */
    public int getPower() {
        return this.power;
    }

    /**
     * @param power
     *            the power to set
     */
    public void setPower(int power) {
        this.power = power;
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
     * @return the centerX
     */
    public int getCenterX() {
        return this.centerX;
    }

    /**
     * @param centerX
     *            the centerX to set
     */
    public void setCenterX(int centerX) {
        this.centerX = centerX;
    }

    /**
     * @return the centerY
     */
    public int getCenterY() {
        return this.centerY;
    }

    /**
     * @param centerY
     *            the centerY to set
     */
    public void setCenterY(int centerY) {
        this.centerY = centerY;
    }

    /**
     * @return the bg
     */
    public Background getBg() {
        return this.bg;
    }

    /**
     * @param bg
     *            the bg to set
     */
    public void setBg(Background bg) {
        this.bg = bg;
    }
}
