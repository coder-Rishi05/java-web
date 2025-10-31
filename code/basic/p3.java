//3. Write a Java program that takes two numbers and display the product of two numbers
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = s.nextInt();
        System.out.print("Enter the value of y: ");
        int y = s.nextInt();
        System.out.println("Product of " + x + " and " + y + " is " + (x * y));
    }
}

/*
Output:
Enter the value of x: 4
Enter the value of y: 6
Product of 4 and 6 is 24
*/
