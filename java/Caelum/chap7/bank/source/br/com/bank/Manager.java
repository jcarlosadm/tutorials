package br.com.bank;

public class Manager extends Employee{
    private int password;
    private int nEmployee;
    
    public Manager(String name, String cpf, double salary,
                int password, int nEmployee){
        super(name, cpf, salary);
        this.password = password;
        this.nEmployee = nEmployee;
    }
    
    public boolean login(int password){
        if(this.password == password){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public void describe(){
        super.describe();
        System.out.println("Número de empregados: "+this.nEmployee);
    }
    
    @Override
    public double getBonus(){
        if(this.salary < 1500)
            return this.salary * 0.15;
        else
            return super.getBonus();
    }
}
