// 17. Program to determine whether a given string is palindrome

class Main {
    public static void main(String[] args) {
        String str = "madam";

        // Build reversed string using a while loop (no StringBuilder.reverse())
        String reversed = "";
        int i = str.length() - 1;
        while (i >= 0) {
            reversed += str.charAt(i);
            i--;
        }

        // Check if original and reversed are same
        if (str.equals(reversed)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}

/*
 * Output:
 * madam is a palindrome
 */
