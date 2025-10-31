//46. Java Program To Calculate CGPA Percentage
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
        per = (om / tm) * 100;
        System.out.println("\nPercentage of student: " + per);
        System.out.println("CGPA of student: " + (per / 9.5f));
    }
}

/*
Output:
Enter the number of subjects: 3

Enter the Obtained marks of 1 Subject: 80
Enter the Total marks of 1 Subject: 100

Enter the Obtained marks of 2 Subject: 75
Enter the Total marks of 2 Subject: 100

Enter the Obtained marks of 3 Subject: 85
Enter the Total marks of 3 Subject: 100

Percentage of student: 80.0
CGPA of student: 8.421052
*/
