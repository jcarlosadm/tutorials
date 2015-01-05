import br.com.bank.*;

class ManagerTest{
    public static void main(String[] args){
        Manager manager = new Manager("João da silva", 4231);
        
        System.out.println(manager.getName());
        if(manager.login(4231)==true){
            System.out.println("logado");
        }else{
            System.out.println("senha errada");
        }
    }
}
