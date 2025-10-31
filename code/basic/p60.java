//60. Write a Java program to display the cube of the number upto given an integer
import java.util.Scanner;

class Main{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n = s.nextInt();
        System.out.println("Number\tCube");
        for(int i = 1; i <= n; i++)
        {
            System.out.println(i + "\t" + (i*i*i));
        }
    }
}

/*
Output:
Enter the value: 5
Number	Cube
1	1
2	8
3	27
4	64
5	125
*/
