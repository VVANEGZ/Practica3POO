import java.util.Date;

public class Cuenta {
    //atributos
    private int id=0;
    private double balance=0;
    private double annualInterestRate=0; //es un porcentaje
    private Date dateCreated;

    //constructores

    public Cuenta() {
        this.dateCreated= new Date();
    }

    public Cuenta(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated= new Date();
    }

    //get y set

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    //otros metodos
    public double getMonthlyInterestRate() {
        return (this.annualInterestRate/100) / 12; //checar la division
    }

    public double withdraw(double amount) {
        this.balance-= amount;

        return balance; //checar esto
    }

    public double getMonthlyInterest(){
        return this.balance * getMonthlyInterestRate();

    }

    public double deposit(double amount) {
        this.balance+=amount;

        return balance;
    }

}
