package br.com.interfaces;

public class Square implements Area {
    private int side;
    
    public Square(int side){
        this.side = side;
    }

    @Override
    public double computeArea() {
        return (this.side * this.side);
    }
    
    
}
