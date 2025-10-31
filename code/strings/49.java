// 49. Create an object StringBuffer class to reverse the string.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Create StringBuffer object
        StringBuffer sb = new StringBuffer(str);

        // Reverse the string using StringBuffer method
        sb.reverse();

        System.out.println("Reversed string: " + sb.toString());
        sc.close();
    }
}

/*
 * Example Input:
 * Enter a string: Hello
 *
 * Output:
 * Reversed string: olleH
 */
