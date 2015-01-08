import br.com.bank.Account;
import br.com.bank.DrawException;


public class Main {
    public static void main(String[] args) {
        Account account = new Account(2000);
        
        try{
            account.draw(3000);
        }catch(DrawException e){
            System.out.println(e.getMessage());
        }
        
        System.out.println(account.getTotal());
    }
}
