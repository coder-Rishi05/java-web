//89. Write a Java program to find the common elements between two arrays
import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size of first array: ");
        int n1 = s.nextInt();
        int arr1[] = new int[n1];
        System.out.print("Enter the elements of first array: ");
        for(int i = 0; i < n1; i++)
            arr1[i] = s.nextInt();

        System.out.print("Enter the size of second array: ");
        int n2 = s.nextInt();
        int arr2[] = new int[n2];
        System.out.print("Enter the elements of second array: ");
        for(int i = 0; i < n2; i++)
            arr2[i] = s.nextInt();

        System.out.print("Common elements: ");
        boolean found = false;
        for(int i = 0; i < n1; i++)
        {
            for(int j = 0; j < n2; j++)
            {
                if(arr1[i] == arr2[j])
                {
                    System.out.print(arr1[i] + " ");
                    found = true;
                    break; // prevent duplicate printing for same element
                }
            }
        }

        if(!found)
            System.out.println("None");
    }
}

/*
Output:
Enter the size of first array: 5
Enter the elements of first array: 1 2 3 4 5
Enter the size of second array: 4
Enter the elements of second array: 3 4 7 8
Common elements: 3 4
*/
