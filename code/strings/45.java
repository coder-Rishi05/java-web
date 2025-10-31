// 45. Reverse String without reverse() function

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reversed = "";

        // Loop from end to start
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);
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
