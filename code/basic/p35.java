//35. Java Program to find volume of cylinder
import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        float r = sc.nextFloat();
        System.out.print("Enter the height: ");
        float h = sc.nextFloat();
        float vol = (22.0f / 7) * r * r * h;
        System.out.println("Volume of Cylinder of radius " + r + " and height " + h + " is " + vol);
    }
}

/*
Output:
Enter the radius: 3
Enter the height: 7
Volume of Cylinder of radius 3.0 and height 7.0 is 197.99997
*/
