//28. Java Program to find area of rectangle
import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        float l = sc.nextFloat();
        System.out.print("Enter the breadth: ");
        float b = sc.nextFloat();
        float area = l*b;
        System.out.println("Area of rectangle of length "+ l +" and breadth "+ b +" is "+ area);
    }
}

/*
output: 

Enter the length: 5
Enter the breadth: 3
Area of rectangle of length 5.0 and breadth 3.0 is 15.0
*/