//43. Java program to sum of N numbers
import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        System.out.print("Enter the numbers: ");
        int m = 0, s = n;
        while(s > 0)
        {
            m = m + sc.nextInt();
            s--;
        }
        System.out.println("Sum of "+ n +" numbers is "+ m);
    }
}

/*
Output:
Enter number of terms: 3
Enter the numbers: 5 10 15
Sum of 3 numbers is 30
*/
