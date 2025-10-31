//41. Java program to calculate average marks
import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total subjects: ");
        int s = sc.nextInt();
        int m = 0, n = s;
        System.out.print("Enter the marks: ");
        while(s > 0)
        {
            m = m + sc.nextInt();
            s--;
        }
        m = m / n;
        System.out.println("Average of " + n + " subjects is " + m);
    }
}

/*
Output:
Enter the total subjects: 3
Enter the marks: 80 90 100
Average of 3 subjects is 90
*/
