package br.com.example;

public abstract class Conta{
    private String name;
    private double saldo;
    
    public Conta(String name,double saldo){
        this.name = name;
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public String getName(){
        return this.name;
    }
}
