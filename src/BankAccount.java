import javax.swing.*;

public class BankAccount {
    private String accnum;
    private double balance;
    private Person customer;

    public BankAccount(String accnum, double balance, Person customer){
        this.setAccnum(accnum);
        this.setBalance(balance);
        this.setCustomer(customer);
    }

    public BankAccount(){
        this ("none", 0, null);
    }

    public String toString(){
        String str = "Account Number: "+ accnum+ "\nBalance: €"+ balance+ "\nAccount Holder: "+ customer.getName();
        return str;
    }

    public void lodgeMoney(){
        double amount = Double.parseDouble(JOptionPane.showInputDialog(null, "How much is being lodged"));
        this.setBalance(getBalance() + amount);
    }

    public void withdrawMoney(){
        double amount = Double.parseDouble(JOptionPane.showInputDialog(null, "How much is being withdrawn"));
        this.setBalance(getBalance() - amount);
    }



    public void setAccnum(String accnum) {
        this.accnum = accnum;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomer(Person customer) {
        this.customer = customer;
    }

    public String getAccnum() {
        return accnum;
    }

    public double getBalance() {
        return balance;
    }

    public Person getCustomer() {
        return customer;
    }
}
