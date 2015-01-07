package br.com.bank;

public class Employee{
    
    protected String name;
    protected String cpf;
    protected double salary;
    
    public Employee(String name, String cpf, double salary){
        this.name = name;
        this.cpf = cpf;
        this.salary = salary;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public double getSalary(){
        return this.salary;
    }
    
    public double getBonus(){
        return this.salary * 0.10;
    }
    
    public void describe(){
        System.out.println("Nome: "+this.getName());
        System.out.println("Cpf: "+this.getCpf());
        System.out.println("Salário: R$ "+this.getSalary());
        System.out.println("Bônus: R$ "+this.getBonus());
    }
}
