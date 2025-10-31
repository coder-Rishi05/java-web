//11. Write a Java program to compare two numbers
import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the first value: ");
        int x = Integer.parseInt(br.readLine());
        System.out.print("Enter the second value: ");
        int y = Integer.parseInt(br.readLine());
        if (x > y) {
            System.out.println(x + " is greater than " + y);
        } else if (x < y) {
            System.out.println(y + " is greater than " + x);
        } else {
            System.out.println("Both values are equal");
        }
    }
}

/*
Output:
Enter the first value: 12
Enter the second value: 8
12 is greater than 8
*/
