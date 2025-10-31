// 17. Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw(). Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the respective methods to handle deposits and withdrawals for each account type.


abstract class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) {
        super(balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Rs." + amount + " deposited in Savings Account.");
        System.out.println("Current Balance: " + balance);
    }

    void withdraw(double amount) {
        if ((balance - amount) < 100) {
            System.out.println("Withdrawal denied! Minimum balance of Rs.100 must be maintained.");
        } else {
            balance -= amount;
            System.out.println("Rs." + amount + " withdrawn from Savings Account.");
            System.out.println("Current Balance: " + balance);
        }
    }
}

class CurrentAccount extends BankAccount {
    CurrentAccount(double balance) {
        super(balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Rs." + amount + " deposited in Current Account.");
        System.out.println("Current Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Withdrawal denied! Insufficient balance in Current Account.");
        } else {
            balance -= amount;
            System.out.println("Rs." + amount + " withdrawn from Current Account.");
            System.out.println("Current Balance: " + balance);
        }
    }
}

class Main {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(500);
        CurrentAccount c = new CurrentAccount(1000);

        System.out.println("----- Savings Account Operations -----");
        s.deposit(200);
        s.withdraw(550);
        s.withdraw(50);

        System.out.println("\n----- Current Account Operations -----");
        c.deposit(300);
        c.withdraw(1200);
        c.withdraw(800);
    }
}


/* OUTPUT:-
----- Savings Account Operations -----
Rs.200 deposited in Savings Account.
Current Balance: 700.0
Rs.550 withdrawn from Savings Account.
Current Balance: 150.0
Withdrawal denied! Minimum balance of Rs.100 must be maintained.
----- Current Account Operations -----
Rs.300 deposited in Current Account.
Current Balance: 1300.0
Rs.1200 withdrawn from Current Account.
Current Balance: 100.0
Rs.800 withdrawn from Current Account.
Current Balance: 200.0
*/
