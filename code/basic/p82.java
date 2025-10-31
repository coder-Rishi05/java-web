//82. Write a Java program to sum values of an array
import java.util.Scanner;

class Main
{
    public static void main (String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = s.nextInt(), sum = 0;
        int arr[] = new int[n];
        System.out.print("Enter the values: ");
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum of all values: " + sum);
    }
}

/*
Output:
Enter the size of array: 5
Enter the values: 2 4 6 8 10
Sum of all values: 30
*/
