
class Employee{
    private String name;
    private String departament;
    private double salary;
    private String dateBegin;
    private String id;
    
    public Employee(String name, String departament, double salary, String dateBegin,String id){
        this.name = name;
        this.departament = departament;
        this.salary = salary;
        this.dateBegin = dateBegin;
        this.id = id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getDepartament(){
        return this.departament;
    }
    
    public void setDepartament(String departament){
        this.departament = departament;
    }
    
    public double getSalary(){
        return this.salary;
    }
    
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    public String getDateBegin(){
        return this.dateBegin;
    }
    
    public void setDateBegin(String dateBegin){
        this.dateBegin = dateBegin;
    }
    
    public String getId(){
        return this.id;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public void addBonusSalary(double bonus){
        this.setSalary(this.getSalary()+bonus);
    }
    
    public double getAnualSalary(){
        return this.getSalary()*12;
    }
    
    public void mostra(){
        System.out.println("data que começou: "+this.dateBegin);
        System.out.println("departamento: "+this.departament);
        System.out.println("id: "+this.id);
        System.out.println("nome: "+this.name);
        System.out.println("salário: "+this.salary);
        System.out.println("salário anual: "+this.getAnualSalary());
    }
}

public class testEmployee{
    public static void main(String[] args){
        Employee emp1 = new Employee("Dan","Marketing",1300,"12/12/2013","1423222");
        
        emp1.addBonusSalary(300);
        
        System.out.print("salário atual: R$ ");
        System.out.format("%10.2f%n", emp1.getSalary());
        System.out.print("Salário anual: R$ ");
        System.out.format("%10.2f%n", emp1.getAnualSalary());
        
        System.out.println("Atributos:");
        emp1.mostra();
        
    }
}
