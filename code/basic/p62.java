//62. Write a Java program to display the multiplication table of a given integer
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n = s.nextInt();

        System.out.println("\nMultiplication Table of " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " × " + i + " = " + (n * i));
        }
    }
}

/*
 Output:
Enter the value: 7

Multiplication Table of 7:
7 × 1 = 7
7 × 2 = 14
7 × 3 = 21
7 × 4 = 28
7 × 5 = 35
7 × 6 = 42
7 × 7 = 49
7 × 8 = 56
7 × 9 = 63
7 × 10 = 70
*/
