// 13. Program to count number of words in a String?

class Main {
    public static void main(String[] args) {
        String str = "I love Java";

        int count = 0; // start with 1 word

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println("Number of words: " + count);
    }
}

/*
 * Output:
 * Number of words: 3
 */