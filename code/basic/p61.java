//61. Write a Java program to display the n terms of odd natural number and their sum    
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = s.nextInt();
        int sum = 0;

        System.out.print("First " + n + " odd natural numbers: ");
        for (int i = 1, count = 0; count < n; i += 2, count++) {
            System.out.print(i + " ");
            sum += i;
        }

        System.out.println("\nSum of these numbers = " + sum);
    }
}

/*
 Output:
Enter the value of n: 5
First 5 odd natural numbers: 1 3 5 7 9 
Sum of these numbers = 25
*/
