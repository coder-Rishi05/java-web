// 2. Program to perform Deep Copy for String?

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter original string: ");
        String original = sc.nextLine();

        // Deep copy: create a new String object
        String copy = new String(original);

        System.out.println("Original String: " + original);
        System.out.println("Copied String: " + copy);

        // Check if both are same object
        if (original == copy) {
            System.out.println("Shallow Copy (same reference)");
        } else {
            System.out.println("Deep Copy (different objects)");
        }

        sc.close();
    }
}

/*
 * Output:
 * Enter original string: Hello
 * Original String: Hello
 * Copied String: Hello
 * Deep Copy (different objects)
 * 
 * Enter original string: whether
 * Original String: whether
 * Copied String: whether
 * Deep Copy (different objects)
 */
