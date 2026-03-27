public interface Account{
    public int deposit(int money);
    public boolean withdraw(int money);
}

public class BankAccount implements Account{
    private int balance;
    public BankAccount(int balance){
        this.balance=balance;
    }
    @Override
    public int deposit(int money){
        this.balance+=money;
        return this.balance;
    }

    @Override
    public boolean withdraw(int money){
        if (money<=this.balance){
            this.balance-=money;
            return true;
        }
        return false;
    }
}