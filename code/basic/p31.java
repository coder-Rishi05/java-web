//31. Java Program to find area of rhombus
import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of 1st diagonal: ");
        float d1 = sc.nextInt();
        System.out.print("Enter the length of 2nd diagonal: ");
        float d2 = sc.nextInt();
        float area = 0.5f * d1 * d2;
        System.out.println("Area of Rohmbus is " + area);
    }
}

/*
Output:
Enter the length of 1st diagonal: 10
Enter the length of 2nd diagonal: 8
Area of Rohmbus is 40.0
*/
