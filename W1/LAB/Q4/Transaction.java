package W1.LAB.Q4;
import java.util.Date;
public class Transaction{
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;
    public Transaction(char type,double amount,double balance,String description){
        this.date=new Date();
        this.type=type;
        this.amount=amount;
        this.balance=balance;
        this.description=description;
    }
    public void setType(char type){
        this.type=type;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void setAmount(double amount){
        this.amount=amount;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public String getDescription(){
        return this.description;
    }
    public double getBalance(){
        return this.balance;
    }
    public double getAmount(){
        return this.amount;
    }
    public Date getDate(){
        return this.date;
    }
    public char getType(){
        return this.type;
    }
}