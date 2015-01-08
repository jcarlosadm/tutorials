
public class Account {
    private double balance;

    void deposit(double value){
        this.balance += value;
    }

    public double getBalance() {
        return this.balance;
    }
    
}
