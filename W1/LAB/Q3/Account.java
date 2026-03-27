package W1.LAB.Q3;
import java.util.Date;

public class Account{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    public Account(){
        this(0,0);
    }
    public Account (int id, double balance){
        this.id=id;
        this.balance=balance;
        this.annualInterestRate=0;
        this.dateCreated=new Date();
    }
    public void setId(int id){
        this.id=id;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate=annualInterestRate;
    }
    public int getId(){
        return this.id;
    }
    public double getBalance(){
        return this.balance;
    }
    public double getAnnualInterestRate(){
        return this.annualInterestRate;
    }
    public Date getDateCreated(){
        return this.dateCreated;
    }
    public double getMonthlyInterestRate(){
        return (getAnnualInterestRate()/12);
    }
    public double getMonthlyInterest(){
        return (getBalance()*getMonthlyInterestRate()/100);
    }
    public void withdraw(double money){
        this.balance-=money;
    }
    public void deposit(double money){
        this.balance+=money;
    }
    public static void main(String[]args){
        Account acc1 = new Account(1122,20000);
        acc1.setAnnualInterestRate(4.5);
        acc1.withdraw(2500);
        acc1.deposit(3000);
        System.out.println("Balance: "+acc1.getBalance());
        System.out.println("MonthlyInterest: "+acc1.getMonthlyInterest());
        System.out.println("Date Created: "+acc1.getDateCreated());
    }
}