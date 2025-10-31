//1. Write a Java program to check if a string contains only digits.

import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        boolean onlyDigits = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') {
                onlyDigits = false;
                break;
            }
        }

        if (onlyDigits) {
            System.out.println("Only digits");
        } else {
            System.out.println("Not only digits");
        }

        sc.close();
    }
}

/*
Output:
Enter a string: 12345
Only digits

Enter a string: hi
Not only digits
*/
