//34. Java Program to find volume of sphere
import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        float r = sc.nextFloat();
        float vol = (4.0f / 3) * (22.0f / 7) * r * r * r;
        System.out.println("Volume of Sphere of radius " + r + " is " + vol);
    }
}

/*
Output:
Enter the radius: 3
Volume of Sphere of radius 3.0 is 113.14286
*/
