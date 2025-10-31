// 24. Program to find the duplicate characters in a string

class Main {
    public static void main(String[] args) {
        String str = "programming";
        int[] freq = new int[256];

        for (char c : str.toCharArray()) {
            freq[c]++;
        }

        System.out.println("Duplicate characters in the string:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 1) {
                System.out.println((char) i + " - " + freq[i] + " times");
            }
        }
    }
}

/*
 * Output:
 * Duplicate characters in the string:
 * r - 2 times
 * g - 2 times
 * m - 2 times
 */
