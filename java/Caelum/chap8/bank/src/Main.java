
public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(100);
        
        System.out.println(account.getBalance());
    }
}
