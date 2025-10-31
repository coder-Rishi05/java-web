// 43. Program to Swapping Pair of Characters
// Explanation: Enter the string and swap every two consecutive characters.

class Main {
    public static void main(String[] args) {
        String str = "abcdef"; // original string
        char[] chars = str.toCharArray(); // convert string to char array

        // Swap characters in pairs
        for (int i = 0; i < chars.length - 1; i += 2) {
            char temp = chars[i];
            chars[i] = chars[i + 1];
            chars[i + 1] = temp;
        }

        // Convert char array back to string
        String swapped = new String(chars);
        System.out.println("After swapping pairs: " + swapped);
    }
}

/*
 * Output:
 * After swapping pairs: badcfe
 */
