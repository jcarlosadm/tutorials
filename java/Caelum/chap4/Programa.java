class Conta{
    int numero;
    String dono;
    double saldo;
    double limite;
    
    double salario;
    
    boolean saca(double valor){
        if(this.saldo < valor){
            return false;
        }
        else{
            this.saldo = this.saldo - valor;
            return true;
        }
    }
    
    void deposita(double quantidade){
        this.saldo += quantidade;
    }
}

class Programa{
    public static void main(String[] args){
        Conta minhaConta = new Conta();
        
        minhaConta.dono = "Duke";
        minhaConta.saldo = 1000.0;
        
        boolean consegui = minhaConta.saca(200);
        if(consegui){
            System.out.println("Consegui sacar");
        }else{
            System.out.println("Não consegui sacar");
        }
        
        minhaConta.deposita(500);
        
        System.out.println("Saldo atual: "+minhaConta.saldo);
    }
}
