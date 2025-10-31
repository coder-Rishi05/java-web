//27. Java Program to find area of triangle
import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        float b = sc.nextFloat();
        System.out.print("Enter the height: ");
        float h = sc.nextFloat();
        float area = 0.5f * b * h;
        System.out.println("Area of Triangle of base " + b + " and height " + h + " is " + area);
    }
}

/*
Output:
Enter the base: 10
Enter the height: 5
Area of Triangle of base 10.0 and height 5.0 is 25.0
*/
