import br.com.bank.*;

class BonusControl{
    private double totalBonus = 0;
    
    public void getBonus(Employee employee){
        totalBonus += employee.getBonus();
    }
    
    public double getTotalBonus(){
        return this.totalBonus;
    }
}

class ManagerTest{
    public static void main(String[] args){
        Manager manager = new Manager("João da silva","99443433322",5000,4231,231);
        
        System.out.println(manager.getName());
        if(manager.login(4231)==true){
            System.out.println("logado");
        }else{
            System.out.println("senha errada");
        }
        
        System.out.println(manager.getBonus());
        
        manager.describe();
        
        BonusControl bonusControl = new BonusControl();
        bonusControl.getBonus(manager);
        bonusControl.getBonus(manager);
        System.out.println("Total de bônus: R$ "+bonusControl.getTotalBonus());
    }
}
