
class Gerente extends Funcionario implements Autenticavel{
    
    private int senha;
    
    public Gerente(int senha, double salario){
        super(salario);
        this.senha = senha;
    }
    
    public boolean login(int senha){
        if(this.senha == senha) return true;
        else return false;
    }
}
