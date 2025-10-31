// 73. Write a Java program to get a substring of a given string between two specified positions
import java.util.Scanner;

class Main
{
    public static void main (String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String st = "", str = s.next();
        System.out.print("Enter the starting position of substring: ");
        int start = s.nextInt() - 1;   // converting to 0-based index
        System.out.print("Enter the last position of substring: ");
        int last = s.nextInt();

        while(start < last)
            st += str.charAt(start++);

        System.out.println("Substring: " + st);
    }
}

/*
Output:
Enter the string: COMPUTER
Enter the starting position of substring: 2
Enter the last position of substring: 5
Substring: OMPU
*/
