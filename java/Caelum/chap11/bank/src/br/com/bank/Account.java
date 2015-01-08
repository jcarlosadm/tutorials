package br.com.bank;

public class Account {
    private double total;

    public Account(double total) {
        this.setTotal(total);
    }

    public void draw(double value) throws DrawException{
        if(this.getTotal() < value)
            throw new DrawException("Saldo insuficiente");
        else
            this.setTotal(this.getTotal() - value);
    }

    public double getTotal() {
        return total;
    }

    private void setTotal(double total) {
        this.total = total;
    }
}
