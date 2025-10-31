//63. Write a Java program that reads an integer and checks whether it is negative, zero, or positive
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if (n > 0)
            System.out.println("The number is Positive!");
        else if (n == 0)
            System.out.println("The number is Zero!");
        else
            System.out.println("The number is Negative!");
    }
}

/*
 Output:
Enter the number: -8
The number is Negative!
*/
