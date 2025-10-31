//47. Java Program to calculate compound interest
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double p = sc.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double r = sc.nextDouble();
        System.out.print("Enter the time (in years): ");
        double t = sc.nextDouble();

        double amount = p * Math.pow((1 + r / 100), t);
        double compoundInterest = amount - p;

        System.out.println("\nCompound Interest = " + compoundInterest);
        System.out.println("Total Amount = " + amount);
    }
}

/*
Output:
Enter the principal amount: 10000
Enter the rate of interest: 5
Enter the time (in years): 2

Compound Interest = 1025.0
Tota
