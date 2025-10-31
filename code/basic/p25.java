//25. Write a Java program to add two numbers without using any arithmetic operators
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int n1 = s.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = s.nextInt();

        int sum = n1;
        for (int i = 1; i <= n2; i++) {
            sum++; // increment sum for each count of n2
        }

        System.out.println("Sum of " + n1 + " and " + n2 + " is " + sum);
    }
}

/*
Output:
Enter the first number: 5
Enter the second number: 3
Sum of 5 and 3 is 8
*/
