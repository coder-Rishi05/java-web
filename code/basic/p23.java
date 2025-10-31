//23. Write a Java program to compute the square root of a given number
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int i = 0, n = s.nextInt();

        if (n >= 0) {
            while ((i * i) <= n)
                i++;
            System.out.println("Square root of " + n + " is " + (i - 1));
        } else {
            System.out.println("Enter positive value!");
        }
    }
}

/*
Output:
Enter the number: 10
Square root of 10 is 3
*/
