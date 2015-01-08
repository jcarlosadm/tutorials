package br.com.interfaces;

public class Rectangle implements Area{
    private int width;
    private int height;
    
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double computeArea() {
        return (this.width * this.height);
    }
}
