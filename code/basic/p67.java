//67. Write a Java program that determines a student’s grade
import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int i = 1, n = sc.nextInt();
        float per, tm = 0, om = 0;
        while(i <= n)
        {
            System.out.print("\nEnter the Obtained marks of "+ i +" Subject: ");
            om += sc.nextFloat();
            System.out.print("Enter the Total marks of "+ i +" Subject: ");
            tm += sc.nextFloat();
            i++;
        }
        per = (float)(om/tm)*100;
        if (per >= 0 && per <= 100)
        {
            if (per > 80)
                System.out.println("\nYour Percentile is "+ per +" and Grade is A");
            else if (per > 60)
                System.out.println("\nYour Percentile is "+ per +" and Grade is B");
            else if (per > 40)
                System.out.println("\nYour Percentile is "+ per +" and Grade is C");
            else
                System.out.println("\nYour Percentile is "+ per +" and Grade is D");
        }
    }
}

/*
Output:
Enter the number of subjects: 3

Enter the Obtained marks of 1 Subject: 75
Enter the Total marks of 1 Subject: 100

Enter the Obtained marks of 2 Subject: 65
Enter the Total marks of 2 Subject: 100

Enter the Obtained marks of 3 Subject: 80
Enter the Total marks of 3 Subject: 100

Your Percentile is 73.333336 and Grade is B
*/
