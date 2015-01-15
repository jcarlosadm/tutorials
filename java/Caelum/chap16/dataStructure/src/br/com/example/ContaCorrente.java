package br.com.example;

public class ContaCorrente extends Conta implements Comparable<Conta>{

    public ContaCorrente(String name, double saldo) {
        super(name, saldo);
    }

    @Override
    public int compareTo(Conta conta) {
        if(this.getSaldo() < conta.getSaldo()){
            return -1;
        }
        if(this.getSaldo() > conta.getSaldo()){
            return 1;
        }
        
        return 0;
    }
    
}
