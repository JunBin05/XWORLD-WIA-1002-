package W1.LAB.Q4;
import W1.LAB.Q3.Account;
import java.util.ArrayList;

public class Account1 extends Account{
    private String name;
    public Account1(String name, int id, double balance){
        super(id,balance);
        this.name=name;
    }

    private ArrayList <Transaction> transactions = new ArrayList<Transaction>();

    public String getName(){
        return this.name;
    }

    public ArrayList<Transaction> getTransactions(){
        return this.transactions;
    }

    @Override
    public void withdraw(double money){
        super.withdraw(money);
        transactions.add(new Transaction('W',money,this.getBalance(),"Withdrawal"));
    }

    @Override
    public void deposit(double money){
        super.deposit(money);
        transactions.add(new Transaction('D',money,this.getBalance(),"Deposit"));
    }

    public static void main(String [] args){
        Account1 acc = new Account1("George",1122,1000.0);
        acc.setAnnualInterestRate(1.5);
        acc.deposit(30);
        acc.deposit(40);
        acc.deposit(50);
        acc.withdraw(5);
        acc.withdraw(4);
        acc.withdraw(2);
        System.out.println("-------ACCOUNT SUMMARY-------");
        System.out.println("Name: "+acc.getName());
        System.out.println("Annual Interest Rate: "+acc.getAnnualInterestRate());
        System.out.println("Monthly Interest Rate: "+acc.getMonthlyInterestRate());
        System.out.println("Balance: "+acc.getBalance());
        System.out.println("--- Transaction History ---");
        for (Transaction t : acc.getTransactions()) {
            System.out.println("Date: " + t.getDate());
            System.out.println("Type: " + t.getType());
            System.out.println("Amount: $" + t.getAmount());
            System.out.println("New Balance: $" + t.getBalance());
            System.out.println("Description: " + t.getDescription());
            System.out.println("---------------------------");
        }
    }
}