// 22. Program to find maximum and minimum occurring character in a string

class Main {
    public static void main(String[] args) {
        String str = "successes";
        int[] freq = new int[256];

        for (char c : str.toCharArray()) {
            freq[c]++;
        }

        char maxChar = str.charAt(0);
        char minChar = str.charAt(0);
        int max = freq[maxChar];
        int min = freq[minChar];

        for (char c : str.toCharArray()) {
            if (freq[c] > max) {
                max = freq[c];
                maxChar = c;
            }
            if (freq[c] < min && freq[c] != 0) {
                min = freq[c];
                minChar = c;
            }
        }

        System.out.println("Maximum occurring character: " + maxChar + " (appears " + max + " times)");
        System.out.println("Minimum occurring character: " + minChar + " (appears " + min + " times)");
    }
}

/*
 * Output:
 * Maximum occurring character: s (appears 4 times)
 * Minimum occurring character: u (appears 1 times)
 */
