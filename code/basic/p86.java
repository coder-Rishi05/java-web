//86. Write a Java program to find the maximum and minimum value of an array
import java.util.Scanner;

class Main
{
    public static void main (String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.print("Enter the values: ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = s.nextInt();
            if(max < arr[i])
                max = arr[i];
            if(min > arr[i])
                min = arr[i];
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}

/*
Output:
Enter the size of array: 5
Enter the values: 10 25 5 40 15
Maximum value: 40
Minimum value: 5
*/
