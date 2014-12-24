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
    
    boolean transfere(Conta destino, double valor){
        boolean retirou = this.saca(valor);
        
        if(retirou == false)
            return false;
        else{
            destino.deposita(valor);
            return true;
        }
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
        
        Conta outraConta = new Conta();
        
        outraConta.dono = "Ze";
        outraConta.saldo = 200;
        
        if(minhaConta.transfere(outraConta,500)==true){
            System.out.println("saldo outraConta: "+outraConta.saldo);
        }else{
            System.out.println("não conseguiu transferir para a outraConta");
        }
        
        System.out.println("Saldo atual: "+minhaConta.saldo);
    }
}
