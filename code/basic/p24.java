//24. Write a Java program to check if a positive number is a palindrome or not
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        int temp = n, rev = 0;

        if (n >= 0) {
            while (temp != 0) {
                rev = rev * 10 + temp % 10;
                temp = temp / 10;
            }
            if (rev == n)
                System.out.println("Number is Palindrome!");
            else
                System.out.println("Number is not Palindrome!");
        } else {
            System.out.println("Enter positive value!");
        }
    }
}

/*
Output:
Enter the number: 121
Number is Palindrome!
*/
