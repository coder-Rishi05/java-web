109. Write a Java program to find the factorial value of any number entered through the keyboard

import java.util.Scanner;

public class FactorialRecursive {
    static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " is " + factorial(num));
        sc.close();
    }
}
output:-
        Enter a number: 5
        Factorial of 5 is 120
        