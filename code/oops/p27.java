/*
27. Write a Java program to create a class called BankAccount with private instance variables accountNumber and balance. 
Provide public getter and setter methods to access and modify these variables.
*/

class BankAccount {
    private String accountNumber;
    private double balance;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setAccountNumber("ACC12345");
        b.setBalance(15000.50);

        System.out.println("Account Number: " + b.getAccountNumber());
        System.out.println("Balance: " + b.getBalance());
    }
}

/*
Sample Output:
Account Number: ACC12345
Balance: 15000.5
*/
