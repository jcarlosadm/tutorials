package br.com.bank;

public class Manager extends Employee{
    private int password;
    private int nEmployee;
    
    public Manager(String name, int password){
        this.name = name;
        this.password = password;
    }
    
    public boolean login(int password){
        if(this.password == password){
            return true;
        }else{
            return false;
        }
    }
}
