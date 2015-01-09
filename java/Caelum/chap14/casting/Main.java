
public class Main{
    public static void main(String[] args){
        Object obj = new Conta(200);
        Conta conta = (Conta) obj;
        System.out.println(conta.getSaldo());
        
        Funcionario func = new Gerente(1234,1500);
        System.out.println(func.getSalario());
        
        Gerente gerente = (Gerente) func;
        
        if(gerente.login(1234))
            System.out.println("ok");
        else
            System.out.println("not ok");
    }
}
