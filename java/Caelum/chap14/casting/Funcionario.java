
public abstract class Funcionario{
    private double salario;
    
    public Funcionario(double salario){
        this.salario = salario;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public void setSalario(double salario){
        if(salario>0)
            this.salario = salario;
    }
}
