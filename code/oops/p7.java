/*
7. Write a Java program to create a class called "Bank" with a collection of accounts and methods to add and remove accounts,
and to deposit and withdraw money. Also define a class called "Account" to maintain account details of a particular customer.
*/

import java.util.*;

class Account {
    int accountNumber;
    String holderName;
    double balance;

    Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully.");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void display() {
        System.out.println("Account No: " + accountNumber + ", Name: " + holderName + ", Balance: " + balance);
    }
}

class Bank {
    ArrayList<Account> accounts = new ArrayList<>();

    void addAccount(Account acc) {
        accounts.add(acc);
        System.out.println("Account added successfully.");
    }

    void removeAccount(int accNo) {
        Account toRemove = null;
        for (Account acc : accounts) {
            if (acc.accountNumber == accNo) {
                toRemove = acc;
                break;
            }
        }
        if (toRemove != null) {
            accounts.remove(toRemove);
            System.out.println("Account removed successfully.");
        } else {
            System.out.println("Account not found!");
        }
    }

    void showAllAccounts() {
        for (Account acc : accounts) {
            acc.display();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account a1 = new Account(101, "Sachin", 5000);
        Account a2 = new Account(102, "Komal", 7000);

        bank.addAccount(a1);
        bank.addAccount(a2);

        a1.deposit(2000);
        a2.withdraw(3000);

        System.out.println("\n--- All Accounts ---");
        bank.showAllAccounts();

        bank.removeAccount(101);

        System.out.println("\n--- After Removal ---");
        bank.showAllAccounts();
    }
}

/*
Output:
Account added successfully.
Account added successfully.
2000.0 deposited successfully.
3000.0 withdrawn successfully.

--- All Accounts ---
Account No: 101, Name: Sachin, Balance: 7000.0
Account No: 102, Name: Komal, Balance: 4000.0
Account removed successfully.

--- After Removal ---
Account No: 102, Name: Komal, Balance: 4000.0
*/
