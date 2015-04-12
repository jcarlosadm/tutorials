package kiloboltgame.framework;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

public class Animation {

    private List<AnimFrame> frames;
    private int currentFrame;
    private long animTime;
    private long totalDuration;

    public Animation() {
        this.frames = new ArrayList<>();
        this.totalDuration = 0;

        synchronized (this) {
            this.animTime = 0;
            this.currentFrame = 0;
        }
    }

    public synchronized void addFrame(Image image, long duration) {
        this.totalDuration += duration;
        this.frames.add(new AnimFrame(image, this.totalDuration));

    }

    public synchronized void update(long elapsedTime) {
        if (this.frames.size() > 1) {
            this.animTime += elapsedTime;
            if (this.animTime >= this.totalDuration) {
                this.animTime = this.animTime % this.totalDuration;
                this.currentFrame = 0;
            }
        }

        while (this.animTime > this.getFrame(this.currentFrame).endTime) {
            this.currentFrame++;
        }

    }

    public synchronized Image getImage() {
        if (this.frames.size() == 0) {
            return null;
        } else {
            return this.getFrame(this.currentFrame).image;
        }
    }

    private AnimFrame getFrame(int i) {
        return (AnimFrame) this.frames.get(i);
    }

    private class AnimFrame {
        Image image;
        long endTime;

        public AnimFrame(Image image, long endtime) {
            this.image = image;
            this.endTime = endtime;
        }
    }

}
