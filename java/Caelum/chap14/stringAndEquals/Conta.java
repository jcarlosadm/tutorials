
public class Conta{
    private double saldo;
    
    public Conta(double saldo){
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public String toString(){
        return "conta com saldo "+this.saldo;
    }
    
    public boolean equals(Object object){
        if(!(object instanceof Conta))
            return false;
        
        Conta outraConta = (Conta) object;
        if(this.saldo == outraConta.getSaldo()){
            return true;
        }
        return false;
    }
}
