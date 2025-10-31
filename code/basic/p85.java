//85. Write a Java program to test if an array contains a specific value
import java.util.Scanner;

class Main
{
    public static void main (String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int i = 0, n = s.nextInt();
        int arr[] = new int[n];   // ✅ fixed: dynamic array size instead of 10
        System.out.print("Enter the values: ");
        for(i = 0; i < n; i++)
            arr[i] = s.nextInt();

        System.out.print("\nEnter the value you want to find: ");
        int f = s.nextInt();

        for(i = 0; i < n; i++){
            if(arr[i] == f)
                break;
        }

        if(i != n)
            System.out.println("Value " + f + " is present at index: " + i);
        else
            System.out.println("Value " + f + " not present!");
    }
}

/*
Output:
Enter the size of array: 5
Enter the values: 10 20 30 40 50
Enter the value you want to find: 30
Value 30 is present at index: 2
*/
