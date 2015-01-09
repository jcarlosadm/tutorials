
public class Main{
    public static void main(String[] args){
        Conta conta = new Conta(200);
        
        System.out.println("descrição: "+conta);
        
        Conta outraConta = new Conta(200);
        
        if(conta.equals(outraConta)){
            System.out.println("iguais");
        }
        else{
            System.out.println("diferentes");
        }
    }
}
