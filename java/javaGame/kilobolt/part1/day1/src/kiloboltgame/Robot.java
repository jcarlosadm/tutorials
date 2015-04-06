package kiloboltgame;

public class Robot {

    private int centerX = 100;
    private int centerY = 382;
    private boolean jumped = false;

    private int speedX = 0;
    private int speedY = 1;

    public void update() {

        if (this.speedX < 0) {
            this.centerX += this.speedX;
        } else if (this.speedX == 0) {
            System.out.println("Do not scroll the background");
        } else {
            if (this.centerX <= 150) {
                this.centerX += this.speedX;
            } else {
                System.out.println("scroll background here");
            }
        }

        if (this.centerY >= 382) {
            this.centerY = 382;
        } else {
            this.centerY += this.speedY;
        }

        if (this.jumped == true) {
            this.speedY += 1;

            if (this.centerY + this.speedY >= 382) {
                this.centerY = 382;
                this.speedY = 0;
                this.jumped = false;
            }
        }

        if (this.centerX + this.speedX <= 60) {
            this.centerX = 61;
        }
    }

    public void moveRight() {
        this.speedX += 6;
    }

    public void moveLeft() {
        this.speedX -= 6;
    }

    public void stop() {
        this.speedX = 0;
    }

    public void jump() {
        if (this.jumped == false) {
            this.speedY = -15;
            this.jumped = true;
        }
    }

    public int getCenterX() {
        return centerX;
    }

    public int getCenterY() {
        return centerY;
    }
}
